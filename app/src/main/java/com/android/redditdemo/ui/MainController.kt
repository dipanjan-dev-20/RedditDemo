package com.android.redditdemo.ui

import android.content.Context
import com.airbnb.epoxy.EpoxyController
import com.android.redditdemo.data.GetDataResponse

class MainController(
    private val context: Context
) : EpoxyController() {

    var data: GetDataResponse? = null
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        data?.dataInfo?.children?.forEach {
            DataItemModel_()
                .id(System.currentTimeMillis())
                .itemModel(it)
                .addTo(this)
        }
    }
}