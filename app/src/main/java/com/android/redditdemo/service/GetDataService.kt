package com.android.redditdemo.service

import com.android.redditdemo.data.GetDataResponse
import retrofit2.http.GET

interface GetDataService {

    @GET("/.json")
    suspend fun getData(): GetDataResponse
}