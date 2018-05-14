package com.example.miichan.omikujiappkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 「おみくじを引く」を押したら、ResultActivityを開始する
        startOmikujiButton.setOnClickListener { startResultActivity() }
    }


    private fun startResultActivity() {
        // Intentの作成
        val intent = Intent(this, ResultActivity::class.java)

        // Activityの開始
        startActivity(intent)
    }
}
