package com.malibin.simplegithub.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malibin.simplegithub.R
import com.malibin.simplegithub.data.SimpleUserInfo
import com.malibin.simplegithub.databinding.ActivitySearchBinding
import com.malibin.simplegithub.ui.SimpleUserInfoAdapter

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = SimpleUserInfoAdapter()
//        adapter.setItemClickListener()

        binding.rvSearchResults.adapter = adapter

        adapter.submitList(SimpleUserInfo.STUBS)
    }

}
