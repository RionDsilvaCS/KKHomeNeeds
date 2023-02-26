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
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splashActivity extends AppCompatActivity {

    Animation bounce;
    ImageView logo;
    RelativeLayout main;
    Button signIn, signUp;
    LottieAnimationView anim1;
    Animation slideUp, fadeIn;
    TextView wel,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent signInIntent = new Intent(this, SignInActivity.class);
        Intent signUpIntent = new Intent(this, SignUpActivity.class);
        Handler handler = new Handler();
        slideUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);

        logo = findViewById(R.id.logo);
        main = findViewById(R.id.welcome_page);
        signIn = findViewById(R.id.signin);
        signUp = findViewById(R.id.signup);
        anim1 = findViewById(R.id.video);
        wel = findViewById(R.id.welcome);
        text = findViewById(R.id.text);

        logo.setVisibility(View.INVISIBLE);
        main.setVisibility(View.INVISIBLE);




        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                anim1.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                main.setVisibility(View.VISIBLE);
                main.startAnimation(slideUp);
                wel.startAnimation(fadeIn);
                text.startAnimation(fadeIn);
                signIn.startAnimation(fadeIn);
                signUp.startAnimation(fadeIn);
            }
        }, 6000);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signUpIntent);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signInIntent);
            }
        });

    }
}