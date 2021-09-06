package com.android.redditdemo.utils

import android.widget.ImageView
import com.android.redditdemo.R
import com.squareup.picasso.Callback
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso

object ImageLoader {


    fun loadImage(target: ImageView, url: String, placeHolder: Int = R.drawable.placeholder) {
        Picasso.get().load(url).placeholder(placeHolder).networkPolicy(NetworkPolicy.OFFLINE).into(target, object :
            Callback {
            override fun onSuccess() {
            }

            override fun onError(e: Exception?) {
                Picasso.get().load(url).placeholder(placeHolder).into(target)
            }

        })

    }
}