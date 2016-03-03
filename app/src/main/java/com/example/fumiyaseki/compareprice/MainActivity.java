package com.example.fumiyaseki.compareprice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView1, webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView1 = (WebView)findViewById(R.id.webView1);
        webView2 = (WebView)findViewById(R.id.webView2);
        webView1.setWebViewClient(new WebViewClient());
        webView2.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://www.yodobashi.com/");
        webView2.loadUrl("https://www.amazon.co.jp/");
    }
}
