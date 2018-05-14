package com.example.miichan.omikujiappkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.StringRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 「おみくじを引く」を押したら、ResultActivityを開始する
        startOmikujiButton.setOnClickListener { ResultActivity.startForResult(this) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == ResultActivity.REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            // 前回のおみくじの結果をタイトルに表示する
            if (data != null && data.getIntExtra(ResultActivity.EXTRA_NAME_RES, -1) != -1) {
                supportActionBar?.title = "前回は%sでした"
                        .format(getString(data.getIntExtra(ResultActivity.EXTRA_NAME_RES, -1)))
            }
        }
    }

    companion object {
        fun setResult(activity: ResultActivity, resultCode: Int, @StringRes nameRes: Int) = activity.setResult(
                resultCode,
                Intent().apply { putExtra(ResultActivity.EXTRA_NAME_RES, nameRes) }
        )
    }
}
