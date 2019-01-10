package com.example.urvish.genricsdemo

class GenricsClass<T>(private val value: T) {
    fun getValue(): T {
        return value
    }
}