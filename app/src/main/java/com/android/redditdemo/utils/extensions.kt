package com.android.redditdemo.utils

import android.content.Context
import android.widget.Toast

fun Context.showToast(strRes: Int) {
    Toast.makeText(this, resources.getString(strRes), Toast.LENGTH_SHORT).show()
}