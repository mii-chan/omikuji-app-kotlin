package com.example.miichan.omikujiappkotlin.model

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import com.example.miichan.omikujiappkotlin.R

enum class Omikuji(@DrawableRes val omikujiRes: Int, @StringRes val nameRes: Int) {
    DAIKICHI(R.drawable.daikichi, R.string.daikichi),
    CHUKICHI(R.drawable.chukichi, R.string.chukichi),
    KICHI(R.drawable.kichi, R.string.kichi),
    KYO(R.drawable.kyo, R.string.kyo),
    DAIKYO(R.drawable.daikyo, R.string.daikyo)
}