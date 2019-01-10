package com.example.urvish.delegationpropertydemo

import android.util.Log
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DemoClass {
    companion object {
        var value by Delegation()
    }
}

class Delegation : ReadWriteProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return 1
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        Log.d("This", "called")
    }

}