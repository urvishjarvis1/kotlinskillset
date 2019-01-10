package com.example.urvish.databaseandsharedprefdemo

import android.os.AsyncTask

class DatabaseAsyncClass:AsyncTask<User,Unit,Unit>(){
    override fun doInBackground(vararg params: User?) {
        var userdao=MainActivity.userDataBase.userDao()
        params.forEach { userdao.insertAll(it!!) }
    }

}