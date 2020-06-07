package com.malibin.simplegithub.ui.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.malibin.simplegithub.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val worker = Thread {
            for (i in 1..4) {
                Log.d("Malibin Debug", "sleep....$i")
                binding.tvCount.text = "sleep....$i"
                Thread.sleep(1_500)
            }
        }
        worker.start()
        // run() 쓰면 안됩니다잉 그냥 멈춥니다. start() 는 run 실행하기 전에 호출스택에 작업 공간을 생성한 다음 run을 시작시킨다.

        Log.d("Malibin Debug", "wake up!")
        binding.tvCount.text = "wake up!"

    }
}
