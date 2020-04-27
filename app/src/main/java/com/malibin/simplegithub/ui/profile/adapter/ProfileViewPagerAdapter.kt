package com.malibin.simplegithub.ui.profile.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.malibin.simplegithub.ui.profile.followers.FollowersFragment
import com.malibin.simplegithub.ui.profile.followings.FollowingsFragment
import com.malibin.simplegithub.ui.profile.organizations.OrganizationsFragment
import com.malibin.simplegithub.ui.profile.repositories.RepositoriesFragment

/**
 * Created By Yun Hyeok
 * on 4월 27, 2020
 */

class ProfileViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = TOTAL_PAGES

    override fun createFragment(position: Int): Fragment = when (position) {
        FRAGMENT_ORGANIZATIONS -> OrganizationsFragment()
        FRAGMENT_REPOSITORIES -> RepositoriesFragment()
        FRAGMENT_FOLLOWERS -> FollowersFragment()
        FRAGMENT_FOLLOWINGS -> FollowingsFragment()
        else -> throw IllegalArgumentException("존재할 수 없는 위치의 프래그먼트")
    }

    companion object {
        const val TOTAL_PAGES = 4

        const val FRAGMENT_ORGANIZATIONS = 0
        const val FRAGMENT_REPOSITORIES = 1
        const val FRAGMENT_FOLLOWERS = 2
        const val FRAGMENT_FOLLOWINGS = 3
    }
}