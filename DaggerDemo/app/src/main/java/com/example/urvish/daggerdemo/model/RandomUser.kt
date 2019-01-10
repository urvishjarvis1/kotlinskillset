package com.example.urvish.daggerdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RandomUser(
    @SerializedName("results")
    @Expose
    val results: List<Result>
)
