package com.malibin.simplegithub.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.malibin.simplegithub.R
import com.malibin.simplegithub.data.GithubAccount
import com.malibin.simplegithub.data.Organization
import com.malibin.simplegithub.databinding.ActivityProfileBinding
import com.malibin.simplegithub.ui.profile.adapter.ProfileViewPagerAdapter
import com.malibin.simplegithub.ui.profile.adapter.ProfileViewPagerAdapter.Companion.FRAGMENT_FOLLOWERS
import com.malibin.simplegithub.ui.profile.adapter.ProfileViewPagerAdapter.Companion.FRAGMENT_FOLLOWINGS
import com.malibin.simplegithub.ui.profile.adapter.ProfileViewPagerAdapter.Companion.FRAGMENT_ORGANIZATIONS
import com.malibin.simplegithub.ui.profile.adapter.ProfileViewPagerAdapter.Companion.FRAGMENT_REPOSITORIES
import com.malibin.simplegithub.ui.profile.followers.FollowersFragment
import com.malibin.simplegithub.ui.profile.followings.FollowingsFragment
import com.malibin.simplegithub.ui.profile.organizations.OrganizationsFragment
import com.malibin.simplegithub.ui.profile.repositories.RepositoriesFragment

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuPager.adapter = ProfileViewPagerAdapter(this)
        binding.account = GithubAccount.STUB

        TabLayoutMediator(binding.tabLayout, binding.menuPager) { tab, position ->
            tab.text = when (position) {
                FRAGMENT_ORGANIZATIONS -> OrganizationsFragment.TAB_NAME
                FRAGMENT_REPOSITORIES -> RepositoriesFragment.TAB_NAME
                FRAGMENT_FOLLOWERS -> FollowersFragment.TAB_NAME
                FRAGMENT_FOLLOWINGS -> FollowingsFragment.TAB_NAME
                else -> throw IllegalArgumentException("존재하지 않는 위치")
            }
        }.attach()

    }
}
