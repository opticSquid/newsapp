package com.example.newsapp

import android.app.Application
import com.example.newsapp.data.AppContainer
import com.example.newsapp.data.AppContainerImpl

class NewsAppApplication : Application() {

    // AppContainer instance used by the rest of classes to obtain dependencies
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}
