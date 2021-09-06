package com.android.redditdemo.repository

import com.android.redditdemo.data.GetDataResponse
import com.android.redditdemo.service.GetDataService
import javax.inject.Inject

class GetDataRepoImpl @Inject constructor(
    private val getDataService: GetDataService
) : GetDataRepo {
    override suspend fun getData(): GetDataResponse {
        return getDataService.getData()
    }
}