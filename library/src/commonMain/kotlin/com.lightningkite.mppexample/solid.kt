package com.lightningkite.mppexample

import kotlin.reflect.KMutableProperty0

interface ListeningLifecycle {
    fun onRemove(action: ()->Unit)

    fun scope(action: RerunScope.()->Unit) {
        val dm = RerunScope(action)
        onRemove { dm.clear() }
    }
    operator fun <T, IGNORED> ((T)->IGNORED).invoke(actionToCalculate: RerunScope.()->T) = scope {
        this@invoke(actionToCalculate(this))
    }
    operator fun <T> KMutableProperty0<T>.invoke(actionToCalculate: RerunScope.()->T) = scope {
        this@invoke.set(actionToCalculate(this))
    }
}
class RerunScope(val action: RerunScope.()->Unit) {
    private val removers: HashMap<Listenable, ()->Unit> = HashMap()
    private val latestPass: HashSet<Listenable> = HashSet()
    fun rerunOn(listenable: Listenable) {
        latestPass.add(listenable)
    }
    private operator fun invoke() {
        latestPass.clear()
        try {
            action()
        } finally {
            // Remove listeners we no longer depend on
            for(entry in removers.entries.toList()) {
                if(entry.key !in latestPass) {
                    entry.value()
                }
            }
            // Add listeners that are new
            for(new in latestPass) {
                if(!removers.containsKey(new)) {
                    removers[new] = new.addListener { this() }
                }
            }
        }
    }

    val <T> Readable<T>.value: T
        get() {
            rerunOn(this)
            return latest
        }
    var <T> Writable<T>.value: T
        get() = (this as Readable<T>).value
        set(value) {
            this.latest = value
        }

    fun clear() {
        removers.forEach { it.value() }
        removers.clear()
    }
    init { this() }
}
interface Listenable {
    fun addListener(listener: ()->Unit): ()->Unit
}
interface Readable<T>: Listenable {
    val latest: T
}
interface Writable<T>: Readable<T> {
    override var latest: T
}

class Property<T>(startValue: T): Writable<T> {
    val listeners = HashSet<()->Unit>()
    override var latest: T = startValue
        set(value) {
            field = value
            listeners.toList().forEach { it() }
        }

    override fun addListener(listener: () -> Unit): () -> Unit {
        listeners.add(listener)
        return {
            listeners.remove(listener)
        }
    }
}
