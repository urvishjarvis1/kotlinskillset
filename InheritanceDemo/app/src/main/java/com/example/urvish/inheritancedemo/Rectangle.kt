package com.example.urvish.inheritancedemo

class Rectangle:Shape{
    var sideHeight:Float=10.0f
    var sideLength:Float=13.0f
    override fun calculateArea(): Float {
        return sideHeight*sideLength
    }
}