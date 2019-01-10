package com.example.urvish.databaseandsharedprefdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @ColumnInfo val email: String,
    @ColumnInfo val pass: String,
    @PrimaryKey(autoGenerate = true) val uid: Int = 0
)