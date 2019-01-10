package com.example.urvish.databaseandsharedprefdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao{
    @Query("Select * from users")
    fun getAll():List<User>
    @Insert
    fun insertAll(vararg user: User)
    @Delete
    fun delete(user:User)

}