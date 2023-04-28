package com.lightningkite.mppexample

import kotlin.coroutines.*

fun fireAndForgetLaunch(action: suspend () -> Unit) {
    lateinit var context: Continuation<Unit>

    action.startCoroutine(
        object : Continuation<Unit> {
            override val context: CoroutineContext = EmptyCoroutineContext
            // called when a coroutine ends. do nothing.
            override fun resumeWith(result: Result<Unit>) {
                result.onFailure { ex : Throwable -> throw ex }
            }
        }
    )

    context.resume(Unit)
}