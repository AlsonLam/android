package com.example.alson.mathx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class Secondary_One extends AppCompatActivity {


     WebView myBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary__one);
        myBrowser = (WebView) findViewById(R.id.mybrowser);
        myBrowser.loadUrl("file:///android_asset/mypage.html");

    }
}
