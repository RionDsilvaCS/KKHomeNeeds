package com.example.kkhomeneeds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    EditText userName = findViewById(R.id.editTextTextPersonName2),password = findViewById(R.id.editTextTextPersonName3);
    TextView forgot_pass;
    Button SignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}