package com.android.redditdemo.utils

sealed class UIEvents

data class ShowLoading(val show:Boolean):UIEvents()
data class ShowToast(val resId:Int):UIEvents()