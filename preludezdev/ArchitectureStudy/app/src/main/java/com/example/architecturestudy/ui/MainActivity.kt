package com.example.architecturestudy.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.architecturestudy.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val vpAdapter = VpAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        //뷰페이저 어댑터 연결
        viewPager.adapter = vpAdapter

        //탭 레이아웃에 뷰페이저 연결
        tabLayout.setupWithViewPager(viewPager)

        //default sort 값
        iv_arrow_coin_name.isSelected = true
    }

}
