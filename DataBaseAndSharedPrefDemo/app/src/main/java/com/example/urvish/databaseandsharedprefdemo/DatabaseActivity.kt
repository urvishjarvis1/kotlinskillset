package com.example.urvish.databaseandsharedprefdemo

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_database.*;

class DatabaseActivity : AppCompatActivity() {
    lateinit var user:ArrayList<User>
    lateinit var userAdapter:UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)
        val task=GetData().execute()


    }
    private inner class GetData:AsyncTask<Unit,Unit,List<User>>() {
        override fun doInBackground(vararg params: Unit?): List<User> {
            val user = MainActivity.userDataBase.userDao().getAll() as ArrayList<User>
            return user
        }

        override fun onPostExecute(result: List<User>?) {
            super.onPostExecute(result)
            userAdapter=UserAdapter(this@DatabaseActivity,result!! as ArrayList<User>)
            listview.adapter=userAdapter

        }
    }
}
