package com.example.urvish.dbflowdemo.model

import com.example.urvish.dbflowdemo.database.BookDatabase
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

@Table(database = BookDatabase::class, name = "book_table")
class Books : BaseModel() {
    @PrimaryKey(autoincrement = true)
    @Column
    var id = 0

    @Column
    var name: String = "book1"
}