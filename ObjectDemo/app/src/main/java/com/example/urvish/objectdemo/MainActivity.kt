package com.example.urvish.objectdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val atheist=object:Person(){
            override fun pray() {
                println("I'm not praying.")
            }
        }
        atheist.eat()
        atheist.talk()
        atheist.pray()
    }
}
