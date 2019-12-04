package com.aditya.hdbrkampfinder.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.aditya.hdbrkampfinder.R;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle bundle = getIntent().getBundleExtra("emailpass");
        String email = bundle.getString("email");
        String password = bundle.getString("pass");

        auth = FirebaseAuth.getInstance();
        TextView tvUser = findViewById(R.id.tv_user);
        tvUser.setText(email+" "+password);
    }

    @Override
    protected void onPause() {
        super.onPause();
        auth.signOut();
    }

}
