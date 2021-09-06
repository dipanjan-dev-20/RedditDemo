package com.android.redditdemo.di

import androidx.lifecycle.ViewModelProvider
import com.android.redditdemo.ui.MainActivity
import com.android.redditdemo.viewModel.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModuleScope::class])
    internal abstract fun contributeOnboardingActivity(): MainActivity


}

@Module
class MainModuleScope {

    @ActivityScope
    @Provides
    fun provideMainViewModel(
        mainActivity: MainActivity,
        appViewModelFactory: AppViewModelFactory
    ): MainViewModel {
        return ViewModelProvider(mainActivity, appViewModelFactory)[MainViewModel::class.java]
    }
}


