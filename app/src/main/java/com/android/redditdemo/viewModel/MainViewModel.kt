package com.android.redditdemo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.redditdemo.R
import com.android.redditdemo.data.GetDataResponse
import com.android.redditdemo.usecase.GetRedditDataUseCase
import com.android.redditdemo.utils.ShowLoading
import com.android.redditdemo.utils.ShowToast
import com.android.redditdemo.utils.SingleLiveEvent
import com.android.redditdemo.utils.UIEvents
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getRedditDataUseCase: GetRedditDataUseCase
) : ViewModel() {

    val loadingEvent by lazy { SingleLiveEvent<UIEvents>() }

    val getDataLvData: LiveData<GetDataResponse> by lazy {
        _getDataMutableLvData
    }

    private val _getDataMutableLvData by lazy {
        MutableLiveData<GetDataResponse>()
    }

    fun getData() {
        loadingEvent.value = ShowLoading(true)
        viewModelScope.launch {
            try {
                val result = getRedditDataUseCase.invoke("")
                _getDataMutableLvData.value = result
            } catch (e: Exception) {
                loadingEvent.value = ShowToast(R.string.something_wrong)
            } finally {
                loadingEvent.value = ShowLoading(false)
            }

        }

    }

}