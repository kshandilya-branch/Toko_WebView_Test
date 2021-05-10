package com.sample.tokopediawebviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webview);
        //webView.loadUrl("https://www.tokopedia.com/ideiby/korek-api-gas-n-kotak-rokokokkk-firetric-focus-cigarette-box-8-slot-hitam?_branch_view_id=720966570692954120");
        webView.loadUrl("https://www.tokopedia.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
    }
}