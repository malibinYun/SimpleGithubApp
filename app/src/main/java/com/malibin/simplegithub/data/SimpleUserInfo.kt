package com.malibin.simplegithub.data

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */

data class SimpleUserInfo(
    val id: String,
    val profileImageUrl: String
) {
    companion object {
        val STUB = SimpleUserInfo(
            id = "pci2676",
            profileImageUrl = "https://avatars0.githubusercontent.com/u/13347548?v=4"
        )

        val STUBS = listOf(
            STUB,
            SimpleUserInfo(
                id = "Livenow14",
                profileImageUrl = "https://avatars0.githubusercontent.com/u/48986787?v=4"
            )
        )

    }

}