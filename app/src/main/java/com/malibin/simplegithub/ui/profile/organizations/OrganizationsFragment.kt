package com.malibin.simplegithub.ui.profile.organizations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.malibin.simplegithub.data.Organization
import com.malibin.simplegithub.databinding.FragmentOrganizationsBinding

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */
class OrganizationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentOrganizationsBinding.inflate(inflater)

        val adapter = OrganizationsAdapter()

        binding.rvOrganizations.adapter = adapter

        adapter.submitList(Organization.STUBS)

        return binding.root
    }

    companion object {
        const val TAB_NAME = "Organizations"
    }
}