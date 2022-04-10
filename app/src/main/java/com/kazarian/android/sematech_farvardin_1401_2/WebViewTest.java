package com.kazarian.android.sematech_farvardin_1401_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_test);

        WebView web_test = findViewById(R.id.web_view);

        web_test.getSettings().setJavaScriptEnabled(true);
        web_test.setWebViewClient(new WebViewClient());
        web_test.loadUrl("https://pouyaheydari.com");
    }
}