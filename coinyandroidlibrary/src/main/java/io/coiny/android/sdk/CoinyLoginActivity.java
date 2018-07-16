package io.coiny.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CoinyLoginActivity extends Activity {

    WebView webView;
    ProgressBar progressBar;

    private String appId;
    private String appSecret;
    private String authToken;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        webView = findViewById(R.id.web_view);
        progressBar = findViewById(R.id.progress_bar);
        webView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);

        appId = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.APP_ID, null);
        appSecret = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.APP_SECRET, null);

        setupWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void setupWebView () {
        String uri = Uri.parse(getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, null)
                + "oauth2/" + appId + "/login")
                .buildUpon()
                .appendQueryParameter("secret", appSecret)
                .build().toString();

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String newAuthToken = request.getUrl().getQueryParameters("auth_token").get(0);

                if (newAuthToken != null) {
                    authToken = newAuthToken;
                    getToken();
                }

                return super.shouldOverrideUrlLoading(view, request);
            }
        });

        webView.loadUrl(uri);
    }

    public void getToken() {
        progressBar.setVisibility(View.VISIBLE);
        webView.setVisibility(View.GONE);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String urlString = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, null)
                            + "applications/" + appId + "/token";
                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                    conn.setRequestProperty("Accept","application/json");
                    conn.setDoOutput(true);
                    conn.setDoInput(true);

                    JSONObject jsonParam = new JSONObject();
                    jsonParam.put("authCode", authToken);
                    jsonParam.put("applicationId", appId);
                    jsonParam.put("applicationSecret", appSecret);

                    DataOutputStream os = new DataOutputStream(conn.getOutputStream());
                    os.writeBytes(jsonParam.toString());

                    os.flush();
                    os.close();

                    StringBuilder sb = new StringBuilder();
                    BufferedReader rd;
                    try {
                        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    } catch (FileNotFoundException e) {
                        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                    }
                    String line;
                    while ((line = rd.readLine()) != null) {
                        sb.append(line);
                    }

                    JSONObject response = new JSONObject(sb.toString());

                    if (response.getString("status").equals("Ok")) {
                        SharedPreferences.Editor editor = getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).edit();
                        editor.putString(Constants.ACCESS_TOKEN, response.getString("data")).apply();
                        finish();
                        Coiny.coinyLoginViewResponseListener.coinyDidLoggedIn();
                    } else {
                        finish();
                        Coiny.coinyLoginViewResponseListener.coinyLoginDidFail(response.getString("message"));
                    }

                    conn.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

}
