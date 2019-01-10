package com.example.urvish.inheritancedemo

class Circle:Shape{
    var radius:Float=10.0f
    override fun calculateArea(): Float {
        return 3.14f*radius*radius
    }
}