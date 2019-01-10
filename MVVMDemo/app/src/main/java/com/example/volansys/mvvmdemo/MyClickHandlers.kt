package com.example.volansys.mvvmdemo

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast

class MyClickHandlers(private val context: Context) {

    fun onFabClicked(view: View) {
        Toast.makeText(context, "FabClicked!", Toast.LENGTH_SHORT).show()
        Log.d("Onclick", "onFabMethod Called")
    }
}

