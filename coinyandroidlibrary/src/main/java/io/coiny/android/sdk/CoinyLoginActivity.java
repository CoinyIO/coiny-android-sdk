package io.coiny.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CoinyLoginActivity extends Activity {

    WebView webView;

    private String appId;
    private String appSecret;
    private String authToken;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        webView = findViewById(R.id.web_view);

        appId = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.APP_ID, null);
        appSecret = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.APP_SECRET, null);

        String uri = Uri.parse(getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, null)
                + "oauth2/" + appId + "/login")
                .buildUpon()
                .appendQueryParameter("secret", appSecret)
                .build().toString();

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Nullable
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {

                String auth_token = request.getUrl().getQueryParameter("auth_token");

                if (auth_token != null) {
                    authToken = auth_token;
                    Log.i("Info", "Logged In");
                    getToken();
                }
                return super.shouldInterceptRequest(view, request);
            }
        });

        webView.loadUrl(uri);
    }

    private void getToken() {
        String url = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, null)
                + "applications/" + appId + "/token";
    }

}
