package com.example.urvish.databaseandsharedprefdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class),version = 1)
abstract class UserDataBase:RoomDatabase(){
    abstract fun userDao():UserDao
}