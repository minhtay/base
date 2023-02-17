package com.example.base.common

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App :Application(){

    companion object{
        lateinit var app:App
    }

    init {
        app = this
    }
}