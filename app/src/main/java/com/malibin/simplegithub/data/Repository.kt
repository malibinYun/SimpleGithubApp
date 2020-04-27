package com.malibin.simplegithub.data

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created By Yun Hyeok
 * on 4월 25, 2020
 */

data class Repository(
    val name: String,
    val description: String,
    val isForked: Boolean,
    val forkCount: Int,
    val stargazerCount: Int,
    val language: String?,
    val createdDate: Date,
    val updatedDate: Date
) {
    companion object {
        val STUB = Repository(
            name = "UDTT-AppleGamsung",
            description = "애플 갬성 측정기 - 당신의 애플 갬성 지수를 측정해보세요.",
            isForked = false,
            forkCount = 0,
            stargazerCount = 7,
            language = "Kotlin",
            createdDate = SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.KOREA
            ).parse("2020-04-18T13:50:50Z")!!,
            updatedDate = SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.KOREA
            ).parse("2020-04-25T01:12:40Z")!!
        )

        val STUBS = listOf(
            STUB,
            Repository(
                name = "SimpleGithubApp",
                description = "스터디 예시앱",
                isForked = false,
                forkCount = 9999,
                stargazerCount = 9999,
                language = "Kotlin",
                createdDate = SimpleDateFormat(
                    "yyyy-MM-dd'T'HH:mm:ss'Z'",
                    Locale.KOREA
                ).parse("2020-04-24T07:30:26Z")!!,
                updatedDate = SimpleDateFormat(
                    "yyyy-MM-dd'T'HH:mm:ss'Z'",
                    Locale.KOREA
                ).parse("2020-04-24T07:38:52Z")!!
            )
        )
    }
}