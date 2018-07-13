package io.coiny.android.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.coiny.android.sdk.Coiny;

public class MainActivity extends AppCompatActivity {

    Button loginWithCoinyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginWithCoinyButton = findViewById(R.id.button);

        Coiny.initialize(this, "08d5e7f5-4b49-4bb4-be00-7d3a60b52ce1",
                "DeZ79FN+4/6HWI7Xl4eE14/e3vxkJ4jQ6CmsZu3GxYk=", true);

        loginWithCoinyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coiny.login(MainActivity.this);
            }
        });
    }
}
