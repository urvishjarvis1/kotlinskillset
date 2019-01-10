package com.example.urvish.daggerdemo.modules

import com.example.urvish.daggerdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBinderModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}