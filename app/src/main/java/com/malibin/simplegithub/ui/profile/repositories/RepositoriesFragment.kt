package com.malibin.simplegithub.ui.profile.repositories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.malibin.simplegithub.data.Repository
import com.malibin.simplegithub.databinding.FragmentRepositoriesBinding

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */

class RepositoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentRepositoriesBinding.inflate(inflater)

        val adapter = RepositoriesAdapter()

        binding.rvRepositories.adapter = adapter

        adapter.submitList(Repository.STUBS)

        return binding.root
    }

    companion object {
        const val TAB_NAME = "Repositories"
    }
}