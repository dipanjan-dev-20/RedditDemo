package com.android.redditdemo.di

import com.android.redditdemo.utils.LoadingDialog
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    @ApplicationScope
    fun getLoader(): LoadingDialog {
        return LoadingDialog()
    }
}