package com.example.mad_practical_7_21012011158

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val webView : FloatingActionButton = findViewById(R.id.webviewbtn)

        webView.setOnClickListener{
            Intent(this@YoutubeActivity,MainActivity::class.java).also{startActivity(it)}
        }

        val myWebView = findViewById<WebView>(R.id.youtubewebview)
        val youtubeId = "fJn9B64Znrk"
        val webSettings : WebSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        myWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")



    }
}