package com.realmofaruna

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import android.view.ViewGroup

class MainActivity : Activity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            webView = WebView(this)

            webView.settings.javaScriptEnabled = true
            webView.settings.domStorageEnabled = true
            webView.settings.databaseEnabled = true
            webView.settings.allowFileAccess = true
            webView.settings.allowContentAccess = true

            webView.webViewClient = WebViewClient()
            webView.webChromeClient = WebChromeClient()

            setContentView(webView)

            webView.loadUrl("file:///android_asset/index.html")

        } catch (e: Exception) {
            showError(e)
        }
    }

    private fun showError(e: Exception) {
        val errorText = TextView(this)

        errorText.setTextColor(Color.WHITE)
        errorText.setBackgroundColor(Color.BLACK)
        errorText.textSize = 16f
        errorText.setPadding(30, 30, 30, 30)

        errorText.text =
            "REALM OF ARUNA ERROR\n\n" +
            e.javaClass.name + "\n\n" +
            (e.message ?: "Unknown error")

        setContentView(errorText)
    }
}
