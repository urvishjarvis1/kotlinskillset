package com.example.urvish.inheritancedemo

class Square:Shape{
    var sideLength:Float=10.0f
    override fun calculateArea(): Float {
        return sideLength*sideLength
    }
}