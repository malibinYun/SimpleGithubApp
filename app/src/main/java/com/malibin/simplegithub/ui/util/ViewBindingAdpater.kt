package com.malibin.simplegithub.ui.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created By Yun Hyeok
 * on 4월 27, 2020
 */

@BindingAdapter("imageUrl")
fun bindImageUrl(imageView: ImageView, imageUrl: String?) {
    if (imageUrl == null) return
    Glide.with(imageView)
        .load(imageUrl)
        .into(imageView)
}

@BindingAdapter("text_date")
fun bindDate(textView: TextView, date: Date) {
    val dateFormat = SimpleDateFormat("MMM d, yyyy hh:mm", Locale.KOREA)
    textView.text = dateFormat.format(date)
}