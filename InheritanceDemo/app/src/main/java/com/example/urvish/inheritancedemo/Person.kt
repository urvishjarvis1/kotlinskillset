package com.example.urvish.inheritancedemo

data class Person(val name: String, var age: Int = 0, var sex: String = "") {

    fun copy(name: String = this.name, age: Int = this.age) = Person(name, age, sex)
}
