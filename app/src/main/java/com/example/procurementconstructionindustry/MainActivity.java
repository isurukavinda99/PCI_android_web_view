package com.example.procurementconstructionindustry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    android.webkit.WebView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = findViewById(R.id.web);
        v.clearCache(true);
        v.setWebViewClient(new WebViewClient());
        v.getSettings().setJavaScriptEnabled(true);
        v.loadUrl("http://10.0.2.2:8000/login");
//        v.loadUrl("https://www.google.com/");
//        WebSettings webSettings = v.getSettings();
//        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(v.canGoBack()){
            v.goBack();
        }else{
            super.onBackPressed();
        }

    }
}