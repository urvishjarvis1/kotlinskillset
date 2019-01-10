package com.example.urvish.overloadingdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

typealias Cordinates = Point
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val onePoint = Cordinates(6, 10)
        val secPoint = Cordinates(2, 5)
        println(onePoint + secPoint)
        println(onePoint - secPoint)
        println(onePoint * secPoint)
        println(onePoint / secPoint)
        println(onePoint + secPoint - onePoint)
    }
}
