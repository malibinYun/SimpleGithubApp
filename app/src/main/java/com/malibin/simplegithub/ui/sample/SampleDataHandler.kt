package com.malibin.simplegithub.ui.sample

import androidx.lifecycle.MutableLiveData

/**
 * Created By Malibin
 * on 6월 08, 2020
 */

class SampleDataHandler {

    var count = MutableLiveData<Int>()

    fun countUp() {
        val currentCount = count.value ?: 0
        count.value = currentCount + 1
    }

}