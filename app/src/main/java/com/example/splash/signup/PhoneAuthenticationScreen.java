package com.example.splash.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.splash.R;

public class PhoneAuthenticationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_authentication_screen);
    }

    public void OtpVarificationScreen(View view) {


        Intent intent = new Intent(PhoneAuthenticationScreen.this,OtpVarificationScreen.class);
        startActivity(intent);
    }
}
