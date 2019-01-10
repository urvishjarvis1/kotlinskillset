package com.example.urvish.delegationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screen=Screen(View())
        val screen1=Screen1(CustomView())
        println(screen.show())
        println(screen1.show())
    }
}
