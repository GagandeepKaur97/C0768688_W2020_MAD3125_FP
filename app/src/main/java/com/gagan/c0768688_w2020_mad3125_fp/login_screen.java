package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_screen extends AppCompatActivity {
    TextView Email;
    TextView password;
    TextView Message;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.button);
        Message = (TextView) findViewById(R.id.message);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(login_screen.this,customer_screen.class);
            startActivity(intent);
            finish();
        }
    });}}

