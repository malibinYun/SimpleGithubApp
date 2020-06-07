package com.malibin.simplegithub.ui.sample

import androidx.databinding.ObservableField

/**
 * Created By Malibin
 * on 6월 08, 2020
 */

class SampleDataHandler {

    var count = ObservableField<Int>(0)

    fun countUp() {
        val currentCount = count.get() ?: 0
        count.set(currentCount + 1)
    }

}