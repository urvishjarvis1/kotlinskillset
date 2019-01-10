package com.example.urvish.daggerdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("first")
    @Expose
    val first: String,
    @SerializedName("last")
    @Expose
    val last: String
)
