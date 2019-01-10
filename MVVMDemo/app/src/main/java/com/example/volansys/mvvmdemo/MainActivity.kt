package com.example.volansys.mvvmdemo

import android.app.Activity
import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volansys.mvvmdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var activity: Activity? = null
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activity = this
        val mainViewModel = MainViewModel(this)
        binding!!.loginData = mainViewModel
        val handlers = MyClickHandlers(this)
        binding!!.handlers = handlers

    }

}
