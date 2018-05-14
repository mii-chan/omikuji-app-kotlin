package com.example.miichan.omikujiappkotlin.model

import android.support.annotation.DrawableRes
import com.example.miichan.omikujiappkotlin.R

enum class Omikuji(@DrawableRes val omikujiRes: Int) {
    DAIKICHI(R.drawable.daikichi),
    CHUKICHI(R.drawable.chukichi),
    KICHI(R.drawable.kichi),
    KYO(R.drawable.kyo),
    DAIKYO(R.drawable.daikyo)
}