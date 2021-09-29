package com.tw1nky.newstest.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tw1nky.newstest.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}