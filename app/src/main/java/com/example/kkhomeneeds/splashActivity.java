package com.example.kkhomeneeds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    Animation bounce;
    ImageView logo, eclippse1,eclippse2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();

        logo=findViewById(R.id.logo);
        eclippse1=findViewById(R.id.downe);
        eclippse2=findViewById(R.id.upe);

        bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                logo.startAnimation(bounce);
                eclippse2.startAnimation(bounce);
                eclippse1.startAnimation(bounce);
            }
        }, 1000);

        Intent secondActivityIntent = new Intent(this, MainActivity.class);
        startActivity(secondActivityIntent);




    }
}