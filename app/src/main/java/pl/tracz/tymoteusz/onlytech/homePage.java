package pl.tracz.tymoteusz.onlytech;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class homePage extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://onlytech.pl");
        mWebView.setWebViewClient(new mWebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                findViewById(R.id.progressBar1).setVisibility(View.GONE);
                findViewById(R.id.activity_main_webview).setVisibility(View.VISIBLE);
            }});


    }

    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

