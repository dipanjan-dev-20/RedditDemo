package com.android.redditdemo.repository

import com.android.redditdemo.data.GetDataResponse

interface GetDataRepo {
    suspend fun getData(): GetDataResponse
}