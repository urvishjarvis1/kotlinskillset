package com.example.urvish.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MyViewModel: ViewModel() {
    lateinit var mName: MutableLiveData<String>;
    fun getmName():MutableLiveData<String>{
        if (mName == null)
            mName = MutableLiveData()
        return mName

    }
}