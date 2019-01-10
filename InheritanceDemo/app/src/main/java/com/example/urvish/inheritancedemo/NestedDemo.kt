package com.example.urvish.inheritancedemo

class Outer {
    private val a = 1

    class Nested {
        fun function() = 2
        //fun function()=a //will not compile
    }
}