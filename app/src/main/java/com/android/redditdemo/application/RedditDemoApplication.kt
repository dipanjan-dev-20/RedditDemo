package com.android.redditdemo.application

import android.content.Context
import androidx.multidex.MultiDex
import com.android.redditdemo.BuildConfig
import com.android.redditdemo.di.DaggerAppComponent
import com.facebook.stetho.Stetho

import dagger.android.DaggerApplication

class RedditDemoApplication : DaggerApplication() {
    private val appComponent =
        DaggerAppComponent.builder().application(this)
            .baseUrl(BuildConfig.BASE_URL).build()

    override fun applicationInjector() = appComponent

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)

    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}