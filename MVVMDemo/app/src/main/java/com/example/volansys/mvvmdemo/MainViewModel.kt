package com.example.volansys.mvvmdemo

import android.content.Context
import android.content.Intent
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import android.util.Log
import android.view.View
import android.widget.Toast


class MainViewModel(private val context: Context) : BaseObservable() {
    private val loginData: LoginData
    var dataEmail: String?
        @Bindable
        get() = loginData.email
        set(email) {
            loginData.email = email
            notifyPropertyChanged(BR.dataEmail)
        }
    var dataPassword: String?
        @Bindable
        get() = loginData.password
        set(pass) {
            loginData.password = pass
        }

    init {
        this.loginData = LoginData()

    }

    fun onLoginButtonClicked(): View.OnClickListener {
        return View.OnClickListener { view ->
            Log.e("Login ", dataEmail!! + dataPassword!!)
            Toast.makeText(view.context, "Login username:$dataEmail Password:$dataPassword", Toast.LENGTH_SHORT).show()
            val intent = Intent(context.applicationContext, ProfileActivity::class.java)
            val name = loginData.email
            intent.putExtra("loginData", name)//todo here!
            context.startActivity(intent)
        }
    }

}
