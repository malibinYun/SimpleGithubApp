package com.malibin.simplegithub.ui.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import com.malibin.simplegithub.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sampleDataHandler = SampleDataHandler()
        binding.handler = sampleDataHandler

        sampleDataHandler.count.addOnPropertyChangedCallback(
            object : Observable.OnPropertyChangedCallback() {
                override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                    sender as ObservableField<Int>
                    Log.d("Malibin Debug", "${sender.get()}")
                }
            })

//        폰이 자고있을 때도 동작하는지 검증해볼까?
//        val handler = Handler()
//        Thread {
//            for(i in 1..10){
//                handler.post { sampleDataHandler.countUp() }
//                Thread.sleep(1000)
//            }
//        }.start()
    }
}
