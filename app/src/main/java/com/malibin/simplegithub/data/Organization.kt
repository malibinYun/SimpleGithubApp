package com.malibin.simplegithub.data

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */
data class Organization(
    val name: String,
    val profileImageUrl: String,
    val description: String
) {
    companion object {
        val STUB = Organization(
            name = "MalibinAndroidStudy",
            profileImageUrl = "https://avatars3.githubusercontent.com/u/64095227?v=4",
            description = ""
        )

        val STUBS = listOf(
            Organization(
                name = "Bring-SOPT",
                profileImageUrl = "https://avatars2.githubusercontent.com/u/46065521?v=4",
                description = ""
            ),
            STUB
        )
    }
}