package io.coiny.android.sdk;

import android.content.Context;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CoinyApiRequest {

    public static void createRequest(final Context context, final String path, final Map<String,
            String> paramaters, final String httpMethod, final CoinyApiRequest.CoinyResponseListener coinyResponseListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String urlString = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.URL, null)
                            + path;
                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod(httpMethod);
                    conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                    conn.setRequestProperty("Accept","application/json");
                    String token = context.getSharedPreferences(Constants.PREFS, Context.MODE_PRIVATE).getString(Constants.OAUTH_TOKEN, null);
                    if (token != null) {
                        conn.setRequestProperty("Authorization", "Bearer "+token);
                    }
                    conn.setDoOutput(false);
                    conn.setDoInput(true);

                    if (paramaters != null) {
                        conn.setDoOutput(true);
                        JSONObject jsonParam = new JSONObject(paramaters);

                        DataOutputStream os = new DataOutputStream(conn.getOutputStream());
                        os.writeBytes(jsonParam.toString());

                        os.flush();
                        os.close();
                    }

                    StringBuilder sb = new StringBuilder();
                    BufferedReader rd;
                    if (conn.getResponseCode()>199 && conn.getResponseCode()<300) {
                        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    } else {
                        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                    }
                    String line;
                    while ((line = rd.readLine()) != null) {
                        sb.append(line);
                    }

                    JSONObject response = new JSONObject(sb.toString());

                    conn.disconnect();
                    if (response.getString("status").equals("Ok")) {
                        coinyResponseListener.coinyRequestSuccess(response);
                    } else {
                        coinyResponseListener.coinyRequestFail(response);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

    public interface CoinyResponseListener {
        void coinyRequestSuccess(JSONObject response);
        void coinyRequestFail(JSONObject error);
    }
}
