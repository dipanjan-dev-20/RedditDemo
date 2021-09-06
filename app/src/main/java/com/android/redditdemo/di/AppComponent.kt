package com.android.redditdemo.di

import com.android.redditdemo.application.RedditDemoApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class, DispatcherModule::class, NetworkModule::class,ApplicationModule::class,ViewModelModule::class,MainModule::class])
interface AppComponent : AndroidInjector<RedditDemoApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: RedditDemoApplication): Builder
        @BindsInstance
        fun baseUrl(baseUrl:String): Builder
        fun build(): AppComponent
    }


}