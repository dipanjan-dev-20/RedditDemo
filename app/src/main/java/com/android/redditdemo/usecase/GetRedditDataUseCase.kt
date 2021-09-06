package com.android.redditdemo.usecase

import com.android.redditdemo.data.GetDataResponse
import com.android.redditdemo.di.IoDispatcher
import com.android.redditdemo.repository.GetDataRepo
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetRedditDataUseCase @Inject constructor(
    private val getDataRepo: GetDataRepo,
    @IoDispatcher dispatcher: CoroutineDispatcher
) : SuspendUseCase<Any?, GetDataResponse>(dispatcher) {
    override suspend fun execute(parameters: Any?): GetDataResponse {
        return getDataRepo.getData()
    }
}