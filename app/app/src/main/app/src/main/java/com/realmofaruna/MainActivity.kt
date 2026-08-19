package com.realmofaruna

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)

        text.text = "REALM OF ARUNA\n\nAPK BERHASIL BERJALAN"
        text.textSize = 24f
        text.setTextColor(Color.WHITE)
        text.setBackgroundColor(Color.rgb(16, 19, 26))
        text.gravity = android.view.Gravity.CENTER

        setContentView(text)
    }
}
