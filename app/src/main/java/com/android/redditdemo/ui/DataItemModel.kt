package com.android.redditdemo.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.android.redditdemo.R
import com.android.redditdemo.data.GetDataResponse
import com.android.redditdemo.utils.ImageLoader
import com.android.redditdemo.utils.KotlinEpoxyHolder
import kotlin.math.roundToInt

@EpoxyModelClass
abstract class DataItemModel : EpoxyModelWithHolder<DataItemModel.DataItemViewHolder>() {

    @EpoxyAttribute
    lateinit var itemModel: GetDataResponse.Data.Children

    override fun getDefaultLayout(): Int = R.layout.data_card_ui

    override fun bind(holder: DataItemViewHolder) {
        super.bind(holder)
        holder.authorNameText.text = itemModel.userData?.subredditNamePrefixed
        holder.titleText.text = itemModel.userData?.title
        holder.timeText.text = """• ${itemModel.userData?.createdUtc?.getDuration()}"""
        if(itemModel.userData?.thumbnail == "self" || itemModel.userData?.thumbnail == ""){
            holder.thumbnailImage.visibility = View.GONE
        } else {
            holder.thumbnailImage.visibility = View.VISIBLE
            ImageLoader.loadImage(holder.thumbnailImage, itemModel.userData?.thumbnail ?: "" )
        }
        val ups:Int = itemModel.userData?.ups ?: 0
        if(ups>=1000){
          holder.likeCount.text = """${(ups / 1000)} K+"""
        } else if (ups>0){
            holder.likeCount.text = ups.toString()
        } else {
            holder.likeCount.text = "Vote"
        }

        val comments:Int = itemModel.userData?.numComments ?: 0
        if(comments>=1000){
            holder.commentCount.text = """${(comments / 1000)} K+"""
        } else if (comments>0){
            holder.commentCount.text = comments.toString()
        } else {
            holder.commentCount.text = "Comment"
        }


    }

    class DataItemViewHolder : KotlinEpoxyHolder() {

        val authorNameText by bind<TextView>(R.id.author_name_text)
        val timeText by bind<TextView>(R.id.time_text)
        val titleText by bind<TextView>(R.id.title_text)
        val thumbnailImage by bind<ImageView>(R.id.thumbnail_image)
        val likeCount by bind<TextView>(R.id.like)
        val commentCount by bind<TextView>(R.id.comment)

    }
}

const val SECONDS: Double = 1.0
const val MINUTES: Double = 60 * SECONDS
const val HOURS = 60 * MINUTES
const val DAY = 24 * HOURS
const val MONTH = 30 * DAY
const val YEAR = 365 * MONTH

fun Double.getDuration(): String {
    val diff = (System.currentTimeMillis() / 1000) - this
    return if (diff < MINUTES) {
        (diff / SECONDS).roundToInt().toString() + " sec"
    } else if (diff < HOURS) {
        (diff / MINUTES).roundToInt().toString() + " min"
    } else if (diff < DAY) {
        (diff / HOURS).roundToInt().toString() + " hr"
    } else if (diff < MONTH) {
        (diff / DAY).roundToInt().toString() + " day"
    } else if (diff < YEAR) {
        (diff / MONTH).roundToInt().toString() + " mon"
    } else {
        (diff / YEAR).roundToInt().toString() + " yr"
    }
}