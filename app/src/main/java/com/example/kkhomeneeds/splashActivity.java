package com.example.kkhomeneeds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Handler;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;

public class splashActivity extends AppCompatActivity {

    Animation bounce;
    ImageView logo;
    RelativeLayout main;
    Button signIn, signUp;
    LottieAnimationView anim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent secondActivityIntent = new Intent(this, MainActivity.class);
        Handler handler = new Handler();

        logo = findViewById(R.id.logo);
        main = findViewById(R.id.welcome_page);
        signIn = findViewById(R.id.signin);
        signUp = findViewById(R.id.signup);
        anim1 = findViewById(R.id.video);

        logo.setVisibility(View.INVISIBLE);
        main.setVisibility(View.INVISIBLE);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                anim1.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                main.setVisibility(View.VISIBLE);

            }
        }, 6000);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(secondActivityIntent);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(secondActivityIntent);
            }
        });

    }
}