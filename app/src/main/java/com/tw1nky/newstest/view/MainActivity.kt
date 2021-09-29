package com.tw1nky.newstest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.tw1nky.newstest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.news_item.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycle_view.apply {
            adapter = NewsAdapter()
        }
    }


}