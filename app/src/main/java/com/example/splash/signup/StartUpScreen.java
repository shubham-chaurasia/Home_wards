package com.example.splash.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import com.example.splash.R;
import com.example.splash.dashboard.Tab1;

public class StartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start_up_screen);
    }

    public void Tab1(View view) {

        Intent tabintent = new Intent(StartUpScreen.this, Tab1.class);
        startActivity(tabintent);
     }

    public void LoginScreen(View view) {

        Intent intent = new Intent(getApplicationContext(),LoginScreen.class);
        startActivity(intent);

    }

    public void SignupScreen(View view) {

        Intent intent = new Intent(getApplicationContext(),SignupScreen.class);
        startActivity(intent);
    }
}

