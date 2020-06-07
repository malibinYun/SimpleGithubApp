package com.malibin.simplegithub.ui.sample

import android.util.Log

/**
 * Created By Malibin
 * on 6월 08, 2020
 */

class SampleDataHandler {

    var count = 0

    fun countUp() {
        count++
        Log.d("Malibin Debug", "$count")
    }

}