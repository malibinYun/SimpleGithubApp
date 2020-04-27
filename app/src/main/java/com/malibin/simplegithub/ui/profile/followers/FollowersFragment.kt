package com.malibin.simplegithub.ui.profile.followers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.malibin.simplegithub.data.SimpleUserInfo
import com.malibin.simplegithub.databinding.FragmentFollowersBinding
import com.malibin.simplegithub.ui.SimpleUserInfoAdapter

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */

class FollowersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFollowersBinding.inflate(inflater)

        val adapter = SimpleUserInfoAdapter()

        binding.rvFollowers.adapter = adapter

        adapter.submitList(SimpleUserInfo.STUBS)

        return binding.root
    }

    companion object {
        const val TAB_NAME = "Followers"
    }
}