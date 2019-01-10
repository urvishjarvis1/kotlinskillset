package com.example.urvish.delegationpropertydemo

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    fun <T : View> Activity.bindView(@IdRes id: Int) = lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
    private val textView by bindView<TextView>(R.id.delegate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("this property set by delegate")
        var demoClass = DemoClass;
        println(demoClass.value)
        demoClass.value = 2
        println(demoClass.value)
    }
}
