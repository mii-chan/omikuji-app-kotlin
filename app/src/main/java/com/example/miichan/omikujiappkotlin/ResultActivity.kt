package com.example.miichan.omikujiappkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.miichan.omikujiappkotlin.model.Omikuji
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    private lateinit var selectedOmikuji: Omikuji

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // おみくじの結果を表示する
        showResult()

        // デフォルトResultをセットする
        val intent = Intent()
        intent.putExtra(EXTRA_NAME_RES, selectedOmikuji.nameRes)
        setResult(RESULT_OK, intent)
    }

    private fun showResult() {
        // Omikujiの全ての値から、ランダムに一つを選択する
        val randomNumber = (Math.random() * Omikuji.values().size).toInt()
        selectedOmikuji = Omikuji.values()[randomNumber]

        omikujiImageView.apply {
            // 選ばれた値の画像をセットする
            setImageResource(selectedOmikuji.omikujiRes)
            // Fade Inのアニメーションを施す
            startAnimation(AnimationUtils.loadAnimation(this@ResultActivity, R.anim.fade_in))
        }
    }

    companion object {
        const val REQUEST_CODE = 101
        const val EXTRA_NAME_RES = "EXTRA_NAME_RES"
    }
}
