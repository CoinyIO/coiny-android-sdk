package io.coiny.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class CoinyLoginActivity extends Activity {

    WebView webView;
    ProgressBar progressBar;

    private String appId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coiny_login);

        webView = findViewById(R.id.web_view);
        progressBar = findViewById(R.id.progress_bar);
        webView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);

        appId = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.APP_ID, null);

        setupWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void setupWebView () {

        String redirectKey;
        String baseUrl = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, "");
        if (baseUrl.equals(Constants.PROD_URL)) {
            redirectKey = "coinypro";
        } else {
            redirectKey = "devcoinypro";
        }
        String redirectUrl = redirectKey+"://success";
        String uri = Uri.parse(getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.OAUTH_URL, null)
                + "oauth_signin")
                .buildUpon()
                .appendQueryParameter("client_id", appId)
                .appendQueryParameter("redirect_uri", redirectUrl)
                .build().toString();

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Uri uri = Uri.parse( url );
                String newAuthToken = uri.getQueryParameters("auth_token").get(0);

                if (newAuthToken != null) {
                    finish();
                    Coiny.coinyLoginViewResponseListener.coinyLoginDidGetToken(newAuthToken);
                }

                return super.shouldOverrideUrlLoading(view, url);
            }
        });

        webView.loadUrl(uri);
    }
}
