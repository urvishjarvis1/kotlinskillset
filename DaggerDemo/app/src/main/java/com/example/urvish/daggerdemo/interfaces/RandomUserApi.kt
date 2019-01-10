package com.example.urvish.daggerdemo.interfaces

import com.example.urvish.daggerdemo.model.RandomUser
import retrofit2.Call
import retrofit2.http.GET

public interface RandomUserApi {
    @GET("api")
    fun getRandomUser(): Call<RandomUser>
}