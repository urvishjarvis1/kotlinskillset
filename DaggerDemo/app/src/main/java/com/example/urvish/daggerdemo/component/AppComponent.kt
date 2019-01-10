package com.example.urvish.daggerdemo.component

import android.app.Application
import com.example.urvish.daggerdemo.MyApplication
import com.example.urvish.daggerdemo.modules.ActivityBinderModule
import com.example.urvish.daggerdemo.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, ActivityBinderModule::class, AppModule::class))
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(application: MyApplication)
}