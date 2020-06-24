package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView : WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.builtInZoomControls = true
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("http://192.168.43.25:8000/")

    }

    override fun onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack()
        }
    }

}