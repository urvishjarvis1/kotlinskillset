package com.example.urvish.genricsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val genricsClass = GenricsClass<Int>(1)
        val value = genricsClass.getValue()
        if (value is Int) {
            Toast.makeText(this, "The type of Value is Int and it's value is $value", Toast.LENGTH_LONG).show()
        }
        val genricsClass1 = GenricsClass<String>("Hello world")
        val value1 = genricsClass1.getValue()
        if (value1 is String) {
            Toast.makeText(this, "The type of Value is String and it's value is $value", Toast.LENGTH_LONG).show()
        }
        val inOutClass = InOutClass<Int>(2)
        val ref: InOutClass<Any> = inOutClass
        if (ref is InOutClass<Any>) {
            Toast.makeText(this, "Type is Any and value is ${ref.get()}", Toast.LENGTH_LONG).show()
        }
        val inoutClass = InoutClass<Number>()
        val ref1: InoutClass<Int> = inoutClass
        ref1.toString(2)
        val ref2: InoutClass<Double> = inoutClass
        ref2.toString(2.4)
    }
}
