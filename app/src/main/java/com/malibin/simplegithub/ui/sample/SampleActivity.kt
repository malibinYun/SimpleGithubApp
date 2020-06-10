package com.malibin.simplegithub.ui.sample

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.malibin.simplegithub.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sampleDataHandler = SampleDataHandler()
        binding.handler = sampleDataHandler
//        binding.lifecycleOwner = this
//        이놈을 지우면 어떻게 될까?

        sampleDataHandler.count.observe(this, Observer {
            Log.d("Malibin Debug", "$it")
        })

//        폰이 자고있을 때도 동작하는지 검증해볼까?
        val handler = Handler()
        Thread {
            for (i in 1..10) {
                handler.post { sampleDataHandler.countUp() }
                Thread.sleep(1000)
            }
        }.start()

    }
}
