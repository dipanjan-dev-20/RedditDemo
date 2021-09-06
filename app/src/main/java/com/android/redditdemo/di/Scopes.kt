package com.android.redditdemo.di

import javax.inject.Scope


@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope

