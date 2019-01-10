package com.example.volansys.mvvmdemo

import android.content.Context
import android.content.Intent
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import android.os.Bundle
import android.widget.ImageView

import com.bumptech.glide.Glide

class ProfileViewModel(private val context: Context, private val intent: Intent) : BaseObservable() {
    private val loginData: LoginData
    private val profileImage: String? = null
    val dataEmail: String?
        @Bindable
        get() = loginData.email
    val dataNo: String
        @Bindable
        get() = Integer.toString(CountingName.getCount(loginData.email!!))

    init {
        val bundle: Bundle?
        bundle = intent.extras
        loginData = LoginData()
        loginData.email = bundle!!.getString("loginData")
        loginData.imgUrl = "https://plus.google.com/u/2/photos/116155971378232332158/albums/profile/6501849024853657042?iso=false"

    }

    fun getProfileImage(): String? {
        return loginData.imgUrl
    }

    companion object {
        @BindingAdapter("profileImage")
        fun loadImage(view: ImageView, imageUrl: String) {
            view.setImageResource(R.drawable.ic_launcher_background)
        }
    }
}
