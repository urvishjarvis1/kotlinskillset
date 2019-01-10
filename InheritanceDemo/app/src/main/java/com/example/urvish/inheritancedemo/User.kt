package com.example.urvish.inheritancedemo

open class User constructor(firstName: String, lastName: String) {
    val firstName = firstName;
    val lastName = lastName;
    public val name: String
        get() = "{$firstName $lastName}"
    var age: Int = 0
}
