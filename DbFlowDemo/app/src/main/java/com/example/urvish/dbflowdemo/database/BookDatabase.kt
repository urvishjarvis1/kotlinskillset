package com.example.urvish.dbflowdemo.database

import com.raizlabs.android.dbflow.annotation.Database

@Database(name = BookDatabase.CONFIG.NAME, version = BookDatabase.CONFIG.VERSION)
class BookDatabase {
    object CONFIG {
        const val NAME = "BookDatabase"
        const val VERSION = 1
    }
}