package io.coiny.android.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

import org.json.JSONObject;

import java.net.URL;

public class Coiny {

    public static Coiny.CoinyLoginViewResponseListener coinyLoginViewResponseListener;

    public static void initialize(Context context, String appId, boolean isDevelopment) {
        SharedPreferences.Editor editor = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).edit();
        editor.putString(Constants.APP_ID, appId);
        if (isDevelopment) {
            editor.putString(Constants.URL, Constants.DEV_URL);
            editor.putString(Constants.OAUTH_URL, Constants.DEV_OAUTH_URL);
        } else {
            editor.putString(Constants.URL, Constants.PROD_URL);
            editor.putString(Constants.OAUTH_URL, Constants.PROD_OAUTH_URL);
        }
        editor.apply();
    }

    public static void login(Context context) {
        Intent loginActivity = new Intent(context, CoinyLoginActivity.class);
        context.startActivity(loginActivity);
    }

    public static void logout(final Context context) {
        CoinyApiRequest.createRequest(context, "logout", null, "POST", new CoinyApiRequest.CoinyResponseListener() {
            @Override
            public void coinyRequestSuccess(JSONObject response) {
                SharedPreferences.Editor editor = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).edit();
                editor.remove(Constants.OAUTH_TOKEN).apply();
            }

            @Override
            public void coinyRequestFail(JSONObject error) {

            }
        });
    }

    public static String handleUrl(Context context, Uri url) {
        String authToken = url.getQueryParameters("auth_token").get(0);
        SharedPreferences.Editor editor = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).edit();
        editor.putString(Constants.OAUTH_TOKEN, authToken).apply();
        return authToken;
    }

    public static void setCoinyLoginViewResponseListener(Coiny.CoinyLoginViewResponseListener coinyLoginViewResponseListener) {
        Coiny.coinyLoginViewResponseListener = coinyLoginViewResponseListener;
    }

    public interface CoinyLoginViewResponseListener {
        void coinyDidLoggedIn();
        void coinyLoginDidFail(String error);
        void coinyLoginDidGetToken(String authToken);
    }
}
