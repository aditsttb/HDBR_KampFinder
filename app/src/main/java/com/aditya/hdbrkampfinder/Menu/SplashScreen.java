package com.aditya.hdbrkampfinder.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.aditya.hdbrkampfinder.R;
import com.aditya.hdbrkampfinder.view.Login;

public class SplashScreen extends AppCompatActivity {
    TextView tvSplashScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tvSplashScreen= (TextView)findViewById(R.id.tvSplashScreen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
        },3000L);

    }

}
