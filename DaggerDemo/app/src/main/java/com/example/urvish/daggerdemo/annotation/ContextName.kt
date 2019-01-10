package com.example.urvish.daggerdemo.annotation

import java.lang.annotation.Documented
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class ContextName(val value: String)