package com.example.urvish.sealedclassdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textview).append("\n" + execute(3, Addition(2)).toString() + "\n")
        findViewById<TextView>(R.id.textview).append(execute(3, Subtraction(2)).toString() + "\n")
        findViewById<TextView>(R.id.textview).append(execute(3, Multiply(2)).toString() + "\n")
        findViewById<TextView>(R.id.textview).append(execute(3, Divide(2)).toString() + "\n")
        findViewById<TextView>(R.id.textview).append(execute(3, Operation.Decrement).toString() + "\n")
        findViewById<TextView>(R.id.textview).append(execute(3, Operation.Increment).toString() + "\n")
    }

    fun execute(X: Int, operation: Operation) = when (operation) {
        is Addition -> X + operation.value
        is Subtraction -> X - operation.value
        is Multiply -> X * operation.value
        is Divide -> X / operation.value
        Operation.Increment -> X + 1
        Operation.Decrement -> X - 1
    }
}
