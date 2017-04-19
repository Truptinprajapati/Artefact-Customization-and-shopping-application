package com.trupti_prajapati.retailapp.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.trupti_prajapati.retailapp.R;

public class Paypal_webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paypal_webview);

        WebView webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        // webView.loadUrl("https://github.com/");
        webView.loadUrl("https://www.paypal.com/signin");
        webView.setWebViewClient(new MyWebViewClient());


    }
}
