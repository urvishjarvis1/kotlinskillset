package com.example.urvish.daggerdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("street")
    @Expose
    val street: String,
    @SerializedName("city")
    @Expose
    val city: String,
    @SerializedName("state")
    @Expose
    val state: String,
    @SerializedName("postcode")
    @Expose
    val postCode: Int

)