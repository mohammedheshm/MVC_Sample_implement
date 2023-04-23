package com.example.mvcsampleimpement.ui

import com.example.mvcsampleimpement.model.Letters

class FakeApiService {

    private val letterList = listOf<Letters>(
        Letters("a", "2023/7/8"),
        Letters("q", "2023/5/1"),
        Letters("w", "2023/8/4"),
        Letters("r", "2023/5/9"),
        Letters("t", "2023/8/9"),
        Letters("y", "2023/1/8"),
        Letters("u", "2023/2/8"),
        Letters("i", "2023/3/8"),
        Letters("o", "2023/8/8"),
        Letters("d", "2023/7/8"),
        Letters("g", "2023/7/8"),
        Letters("y", "2023/7/8"),
        Letters("j", "2023/7/8"),
        Letters("k", "2023/7/8"),
        Letters("m", "2023/5/8"),
        Letters("i", "2023/10/8"),
        Letters("v", "2023/12/8"),
        Letters("l", "2023/6/8"),
        Letters("p", "2023/3/8"),
        Letters("z", "2023/7/8"),
    )


    fun getRandomLetters(): Letters {
        val random = (Math.random() * letterList.size).toInt()
        return letterList[random]

    }

}