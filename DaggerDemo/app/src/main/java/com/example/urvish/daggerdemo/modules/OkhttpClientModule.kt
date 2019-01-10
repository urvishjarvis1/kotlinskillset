package com.example.urvish.daggerdemo.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class OkhttpClientModule {
    @Provides
    public fun okHttpClient(): OkHttpClient = OkHttpClient().newBuilder().build()
}