package com.example.volansys.mvvmdemo

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volansys.mvvmdemo.databinding.PhotoBinder


class ProfileActivity : AppCompatActivity() {
    private var profileBinding: PhotoBinder? = null
    private var profileViewModel: ProfileViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        val i = intent
        profileViewModel = ProfileViewModel(this, i)
        profileBinding!!.photoData = profileViewModel


    }
}
