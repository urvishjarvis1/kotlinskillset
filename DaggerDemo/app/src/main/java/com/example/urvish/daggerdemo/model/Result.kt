package com.example.urvish.daggerdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("name")
    @Expose
    val name: Name,
    @SerializedName("location")
    @Expose
    val location: Location,
    @SerializedName("email")
    @Expose
    val email: String,
    @SerializedName("picture")
    @Expose
    val picture: Picture
)