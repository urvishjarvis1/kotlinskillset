package com.example.urvish.sealedclassdemo

sealed class Operation {
    object Increment : Operation()
    object Decrement : Operation()
}

class Addition(val value: Int) : Operation()
class Subtraction(val value: Int) : Operation()
class Multiply(val value: Int) : Operation()
class Divide(val value: Int) : Operation()

