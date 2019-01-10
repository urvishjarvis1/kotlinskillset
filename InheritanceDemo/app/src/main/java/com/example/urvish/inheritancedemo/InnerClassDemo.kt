package com.example.urvish.inheritancedemo

class OuterClass {
    private val a = 1

    inner class InnerClass {
        fun function() = a //successfully compile.
    }
}