package com.example.akminimall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class EmailVerifyActivity extends AppCompatActivity {

    private TextView textView64, textView72;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verify);

        textView64 = findViewById(R.id.textView64);
        textView72 = findViewById(R.id.textView72);

        mAuth = FirebaseAuth.getInstance();

        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailVerifyActivity.this, StartActivity.class);
                startActivity(intent);
                finish();
                mAuth.signOut();
            }
        });

        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.getCurrentUser().sendEmailVerification();
                Toast.makeText(getApplicationContext(), "Email verification sent again", Toast.LENGTH_LONG).show();
            }
        });
    }
}
