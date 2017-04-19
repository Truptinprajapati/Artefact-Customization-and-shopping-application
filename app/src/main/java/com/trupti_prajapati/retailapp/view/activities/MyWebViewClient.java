package com.trupti_prajapati.retailapp.view.activities;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lenovo on 15-03-2017.
 */
public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}



