package com.example.urvish.enumclassesdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for(enum in Months.values()){
            println(enum.name)
            println(enum.ordinal)
            enum.printData()
        }

        val months=Months.February
        when (months){
            Months.February->println("Happy Birthday urvish!")
            else ->println("You know the drill. Go get some!")
        }
    }
}
