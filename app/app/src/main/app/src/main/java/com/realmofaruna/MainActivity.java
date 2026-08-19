package com.realmofaruna;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);

        text.setText("REALM OF ARUNA\n\nAPK BERHASIL BERJALAN");
        text.setTextSize(24);
        text.setTextColor(Color.WHITE);
        text.setBackgroundColor(Color.rgb(16, 19, 26));
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
