package com.example.akminimall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class PhoneVerifyActivity extends AppCompatActivity {

    private TextView textView67, textView68;

    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verify);

        textView67 = findViewById(R.id.textView67);
        textView68 = findViewById(R.id.textView68);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();


    }
}
