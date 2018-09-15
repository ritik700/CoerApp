package com.example.ritik.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://coer.ac.in");

       // webView.loadData("<html><body><h1>yo buddy</h1><p>HAHAHAHA SOMETHING SOMETHING</p></body></html"
          //      , "text/html" , "UTF-8");
    }
}
