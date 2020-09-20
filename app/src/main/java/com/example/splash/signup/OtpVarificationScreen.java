package com.example.splash.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.splash.R;

public class OtpVarificationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_varification_screen);
    }

    public void SignupScreen(View view) {

        Intent intent = new Intent(OtpVarificationScreen.this,PhoneAuthenticationScreen.class);
        startActivity(intent);
    }
}
