package com.example.miichan.omikujiappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.miichan.omikujiappkotlin.model.Omikuji
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // おみくじの結果を表示する
        showResult()
    }

    private fun showResult() {
        // Omikujiの全ての値から、ランダムに一つを選択する
        val randomNumber = (Math.random() * Omikuji.values().size).toInt()
        val selectedOmikuji = Omikuji.values()[randomNumber]

        // 選ばれた値の画像をセットする
        omikujiImageView.setImageResource(selectedOmikuji.omikujiRes)

        // Fade Inのアニメーションを施す
        omikujiImageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))
    }
}
