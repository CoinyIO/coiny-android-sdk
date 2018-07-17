package io.coiny.android.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import org.json.JSONObject;

public class Coiny {

    public static Coiny.CoinyLoginViewResponseListener coinyLoginViewResponseListener;

    public static void initialize(Context context, String appId, String appSecret, boolean isDevelopment) {
        SharedPreferences.Editor editor = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).edit();
        editor.putString(Constants.APP_ID, appId);
        editor.putString(Constants.APP_SECRET, appSecret);
        if (isDevelopment) {
            editor.putString(Constants.URL, Constants.DEV_URL);
        } else {
            editor.putString(Constants.URL, Constants.PROD_URL);
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
                editor.remove(Constants.ACCESS_TOKEN).apply();
            }

            @Override
            public void coinyRequestFail(JSONObject error) {

            }
        });
    }

    public static void setCoinyLoginViewResponseListener(Coiny.CoinyLoginViewResponseListener coinyLoginViewResponseListener) {
        Coiny.coinyLoginViewResponseListener = coinyLoginViewResponseListener;
    }

    public interface CoinyLoginViewResponseListener {
        void coinyDidLoggedIn();
        void coinyLoginDidFail(String error);
    }
}
