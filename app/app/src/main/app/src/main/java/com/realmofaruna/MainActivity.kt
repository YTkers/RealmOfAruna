package com.realmofaruna

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.loadDataWithBaseURL(
            null,
            """
            <!DOCTYPE html>
            <html>
            <body style="background:#10131a;color:white;text-align:center;padding-top:100px">
                <h1>Realm Of Aruna</h1>
                <p>WebView berhasil berjalan!</p>
            </body>
            </html>
            """.trimIndent(),
            "text/html",
            "UTF-8",
            null
        )

        setContentView(webView)
    }
}
