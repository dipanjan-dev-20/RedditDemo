package com.android.redditdemo.di

import com.android.redditdemo.repository.GetDataRepo
import com.android.redditdemo.repository.GetDataRepoImpl
import com.android.redditdemo.service.GetDataService
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {

    @ApplicationScope
    @Provides
    fun provideStetho(): StethoInterceptor = StethoInterceptor()

    @ApplicationScope
    @Provides
    fun provideClient(stethoInterceptor: StethoInterceptor): OkHttpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(stethoInterceptor)
        .build()

    @ApplicationScope
    @Provides
    fun provideMoshi(): Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @ApplicationScope
    @Provides
    fun provideConverterfactory(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    @ApplicationScope
    @Provides
    fun provideRetrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addConverterFactory(moshiConverterFactory)
        .build()

    @ApplicationScope
    @Provides
    fun provideGetDataService(retrofit: Retrofit): GetDataService {
        return retrofit.create(GetDataService::class.java)
    }

    @ApplicationScope
    @Provides
    fun getDataRepo(getDataService: GetDataService): GetDataRepo {
        return GetDataRepoImpl(getDataService)
    }
}