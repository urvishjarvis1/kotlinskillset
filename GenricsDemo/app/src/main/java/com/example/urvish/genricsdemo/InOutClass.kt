package com.example.urvish.genricsdemo

class InOutClass<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

class InoutClass<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}