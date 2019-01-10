package com.example.urvish.databaseandsharedprefdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
       public lateinit var userDataBase:UserDataBase
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref = getSharedPreferences(getString(R.string.userdata), Context.MODE_PRIVATE)
        userDataBase=Room.databaseBuilder(this,UserDataBase::class.java,"Users.db").build()
        var userName = emailadd?.text?.toString()
        var pass = password?.text?.toString()
        emailadd.setText(sharedPref.getString(getString(R.string.email), "abc"))
        password.setText(sharedPref.getString(getString(R.string.pass), "abc"))
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userName = emailadd.text?.toString()
                pass = password?.text?.toString()
                with(sharedPref.edit()) {
                    putString(getString(R.string.email), userName)
                    putString(getString(R.string.pass), pass)
                    apply()
                }
            }
        }
        loginButton.setOnClickListener {
             userName = emailadd?.text?.toString()
             pass = password?.text?.toString()
            if (userName.isNullOrEmpty()) {
                emailadd.setError("please enter valid email")
                return@setOnClickListener
            }
            if (pass.isNullOrEmpty()) {
                emailadd.setError("please enter valid password")
                return@setOnClickListener
            }
            val user = User(userName ?: "urvish.rana@volansystech.com", pass ?: "1234")
            val task=DatabaseAsyncClass().execute(user)
            val intent=Intent(this@MainActivity,DatabaseActivity::class.java)
            startActivity(intent)
        }

    }

}
