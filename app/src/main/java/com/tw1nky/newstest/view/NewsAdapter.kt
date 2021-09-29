package com.tw1nky.newstest.view

import android.annotation.SuppressLint
import android.media.Image
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.tw1nky.newstest.NewsEntity
import com.tw1nky.newstest.R
import java.util.*

class NewsAdapter() : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    private var newsList: List<NewsEntity> = listOf()

    inner class NewsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private var name: TextView? = null

        var description: TextView? = null
        var image: Image? = null

        init {
            name = itemView.findViewById(R.id.name)
            description = itemView.findViewById(R.id.description)
            image = itemView.findViewById(R.id.image)

        }

        @SuppressLint("SimpleDateFormat")
        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(news: NewsEntity) {
            name?.text = news.name
            description?.text = news.description

        }
    }


    fun updateList(historyList: List<NewsEntity>) {
        this.newsList = historyList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    @SuppressLint("CheckResult")
    override fun getItemCount(): Int {
        return newsList.size
    }
}