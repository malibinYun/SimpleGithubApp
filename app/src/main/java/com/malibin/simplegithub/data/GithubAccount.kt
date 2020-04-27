package com.malibin.simplegithub.data

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */

data class GithubAccount(
    val id: String,
    val name: String,
    val profileImageUrl: String,
    val bio: String?,
    val email: String?,
    val blog: String?,
    val company: String?,
    val location: String?,
    val repoCount: Int,
    val followerCount: Int,
    val followingCount: Int,
    val createdDate: Date,
    val updatedDate: Date
) {
    companion object {
        val STUB = GithubAccount(
            id = "nightmare73",
            name = "Malibin",
            profileImageUrl = "https://avatars0.githubusercontent.com/u/44341119?v=4",
            bio = "made by Yun Hyeok",
            email = null,
            blog = "https://modelmaker.tistory.com",
            company = null,
            location = null,
            repoCount = 33,
            followerCount = 35,
            followingCount = 34,
            createdDate = SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.KOREA
            ).parse("2018-10-21T14:03:29Z")!!,
            updatedDate = SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.KOREA
            ).parse("2020-04-24T07:41:06Z")!!
        )
    }
}