package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.splash.signup.StartUpScreen;

public class intro extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2950;

    TextView title, slogan;
    ImageView background;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        title = findViewById(R.id.title);
        slogan = findViewById(R.id.slogan);
        background = findViewById(R.id.background);
        lottieAnimationView = findViewById(R.id.lottie);

        title.animate().translationY(1400).setDuration(700).setStartDelay(5000);
        background.animate().translationY(-1600).setDuration(700).setStartDelay(5000);
        slogan.animate().translationY(1400).setDuration(700).setStartDelay(5000);
        lottieAnimationView.animate().translationY(1400).setDuration(700).setStartDelay(5000);


        //splash Screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(intro.this, StartUpScreen.class );
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
        }
}
