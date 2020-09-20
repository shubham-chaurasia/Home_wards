package com.example.splash.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.splash.R;

public class SignupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
    }


    public void PhoneAuthenticationScreen(View view) {

        Intent intent = new Intent(SignupScreen.this, PhoneAuthenticationScreen.class);
        startActivity(intent);
    }
}
