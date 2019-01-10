package com.example.urvish.daggerdemo.modules

import com.example.urvish.daggerdemo.MainActivity
import com.example.urvish.daggerdemo.annotation.ContextName
import dagger.Module
import dagger.Provides

@Module
public class MainActivityModule {
    @Provides
    @ContextName("Activity")
    public fun provideContext(context: MainActivity) = context
}