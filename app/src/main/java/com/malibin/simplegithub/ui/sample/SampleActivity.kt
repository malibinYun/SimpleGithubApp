package com.malibin.simplegithub.ui.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.malibin.simplegithub.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sampleDataHandler = SampleDataHandler()
        binding.handler = sampleDataHandler
    }
}
