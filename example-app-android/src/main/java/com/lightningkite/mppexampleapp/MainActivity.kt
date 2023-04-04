package com.lightningkite.mppexampleapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.lightningkite.mppexample.setBackgroundColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.label)!!.also {
            it.setText(platform)
            setViewToRed(it)
        }
    }
}