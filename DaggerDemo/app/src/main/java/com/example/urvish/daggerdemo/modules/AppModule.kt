package com.example.urvish.daggerdemo.modules

import android.app.Application
import android.content.Context
import com.example.urvish.daggerdemo.annotation.ContextName
import com.example.urvish.daggerdemo.interfaces.RandomUserApi
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = arrayOf(OkhttpClientModule::class))
public class AppModule {
    @Provides
    @Singleton
    public fun randomUserApi(retrofit: Retrofit): RandomUserApi = retrofit.create(RandomUserApi::class.java)

    @Provides
    @Singleton
    public fun retrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory) =
        Retrofit.Builder().baseUrl("https://randomuser.me/").client(okHttpClient).addConverterFactory(
            gsonConverterFactory
        ).build();

    @Provides
    @Singleton
    public fun gson() = GsonBuilder().create()

    @Provides
    @ContextName("Application")
    public fun context(context: Application): Context = context

    @Provides
    @Singleton
    public fun gsonConverterFactory(gson: Gson) = GsonConverterFactory.create(gson)

    @Provides
    @Singleton
    public fun picasso(@ContextName("Application") context: Context, okHttp3Downloader: OkHttp3Downloader) =
        Picasso.Builder(context).downloader(okHttp3Downloader).build()

    @Provides
    @Singleton
    public fun okHttp3Downloader(okHttpClient: OkHttpClient) = OkHttp3Downloader(okHttpClient)
}