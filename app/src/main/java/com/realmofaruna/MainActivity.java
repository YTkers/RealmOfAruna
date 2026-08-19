 package com.realmofaruna;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("REALM OF ARUNA\n\nAPK BERHASIL BERJALAN");
        text.setTextSize(24);

        setContentView(text);
    }
}
