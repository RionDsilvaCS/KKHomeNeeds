package com.example.kkhomeneeds;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    EditText userName = findViewById(R.id.editTextTextPersonName2),email = findViewById(R.id.editTextTextPersonName3),password = findViewById(R.id.editTextTextPersonName4);
    TextView forgot_pass;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }
}