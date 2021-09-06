package com.android.redditdemo.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class SuspendUseCase<in Params, out S>(private val coroutineDispatcher: CoroutineDispatcher) {

    suspend operator fun invoke(parameters: Params): S {
        return try {
            withContext(coroutineDispatcher) {
                execute(parameters)
            }
        } catch (e: Exception) {
            //Timber.d(e)
            throw e
        }
    }

    @Throws(RuntimeException::class)
    protected abstract suspend fun execute(parameters: Params): S
}