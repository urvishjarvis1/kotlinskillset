package com.example.urvish.companiondemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val personClass=PersonClass.getNickNameFromEmail("UrvishRana3728@gmail.com")
        println(personClass.NickName)
        val personClass1=PersonClass.NickNameGetter.getNickNameFromEmail("dodo@gmail.com")
        println(personClass1)
        PersonClass.readName("urvishrana3728@gmail.com");

    }
}
