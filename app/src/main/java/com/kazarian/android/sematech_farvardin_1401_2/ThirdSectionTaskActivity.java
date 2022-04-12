package com.kazarian.android.sematech_farvardin_1401_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class ThirdSectionTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_section_task);

        WebView mywebview = findViewById(R.id.section3_webview);
        Button showdrower = findViewById(R.id.btn_ShowDrower);
        DrawerLayout mydrower = findViewById(R.id.drowermain);
        VideoView myVideoView = findViewById(R.id.VideoView_sample);
        Button showtoast = findViewById(R.id.btn_toast);

        //----web view code
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://www.google.com");

        //----video view code
        String myUrl = "https://hajifirouz7.cdn.asset.aparat.com/aparat-video/1dc96fe31bebf041c8f3df91f53161a044095362-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjNjZTg2YzY3MTU1NmJiMjBjODAwYjkyYzQ2YmFjMzNmIiwiZXhwIjoxNjQ5Nzg2NjEyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.bJeZN20_0PNHrPC-EUxjhqyKdPUo6yPnKjhzYLia8z8";
        myVideoView.setVideoURI(Uri.parse(myUrl));
        myVideoView.setMediaController(new MediaController(ThirdSectionTaskActivity.this));
        myVideoView.start();


        //----button click show drawer menue by click code
        showdrower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydrower.openDrawer(Gravity.LEFT);
            }
        });

        //----button when clicked shows a toast
        showtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ThirdSectionTaskActivity.this, "tost", Toast.LENGTH_LONG ).show();
            }
        });
    }
}