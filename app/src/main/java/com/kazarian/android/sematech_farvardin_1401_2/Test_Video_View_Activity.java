package com.kazarian.android.sematech_farvardin_1401_2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Test_Video_View_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__video__view_);

        String my_url = "https://hajifirouz7.cdn.asset.aparat.com/aparat-video/2cb2683c7ff3cd629c1194bf0587a4a044071020-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjA4NGM0ZDkyYTQ4M2Y4Zjk0MmIwNzlmZGQzOTA4YjIxIiwiZXhwIjoxNjQ5NjAwMzUyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.Zze0HqesN8FzD-V4A0qYvMfyEV5GbJ2Ul2ncHSALzrA";
        VideoView videov = findViewById(R.id.videov);
        videov.setVideoURI(Uri.parse(my_url));
        videov.setMediaController(new MediaController(Test_Video_View_Activity.this));
        videov.start();
    }
}