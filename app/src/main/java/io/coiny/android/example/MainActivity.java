package io.coiny.android.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.json.JSONObject;

import io.coiny.android.sdk.Coiny;
import io.coiny.android.sdk.CoinyApiRequest;

public class MainActivity extends AppCompatActivity implements Coiny.CoinyLoginViewResponseListener {

    Button loginWithCoinyButton;
    Button walletsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginWithCoinyButton = findViewById(R.id.login_button);
        walletsButton = findViewById(R.id.wallets_button);

        Coiny.initialize(this, "APP_ID", true);
        Coiny.setCoinyLoginViewResponseListener(this);

        loginWithCoinyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coiny.login(MainActivity.this);
            }
        });

        walletsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CoinyApiRequest.createRequest(MainActivity.this, "wallets",
                        null, "GET", new CoinyApiRequest.CoinyResponseListener() {
                    @Override
                    public void coinyRequestSuccess(JSONObject response) {
                        Log.i("CoinyWallets", response.toString());
                    }

                    @Override
                    public void coinyRequestFail(JSONObject error) {
                        Log.i("CoinyWallets", error.toString());
                    }
                });
            }
        });
    }

    @Override
    public void coinyDidLoggedIn() {
        Log.i("CoinyLogin", "Successful");
    }

    @Override
    public void coinyLoginDidFail(String error) {
        Log.i("CoinyLogin", error);
    }

    @Override
    public void coinyLoginDidGetToken(String authToken) {
        Log.i("CoinyLogin", authToken);
    }
}
