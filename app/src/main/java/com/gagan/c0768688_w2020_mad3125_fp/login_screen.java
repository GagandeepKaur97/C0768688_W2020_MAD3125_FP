package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class login_screen extends AppCompatActivity {
   private TextView Email;
   private   TextView Password;
   private CheckBox Remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        ActionBar actBar = getSupportActionBar();
        assert actBar != null;
        actBar.setTitle("Login");

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.password);
        Button login = findViewById(R.id.button);
        Remember = findViewById(R.id.checkBox);

        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        Email.setText(sharedPreferences.getString("email",null));
        Password.setText(sharedPreferences.getString("password",null));


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String email1 = Email.getText().toString().trim();
            String password1 = Password.getText().toString().trim();

                if(email1.isEmpty()){
                Email.setError("Please enter email");
            } else if(password1.isEmpty()){
                Password.setError("Please enter password");
            } else if(Email.getText().toString().equals("Gagan@gmail.com") && Password.getText().toString().equals("gagan")){
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                if (Remember.isChecked()){
                    editor.putString("email",email);
                    editor.putString("password",password);
                    editor.apply();

                    Intent intent = new Intent(login_screen.this, customer_screen.class);
                    startActivity(intent);
                }else {
                    editor.clear();
                    editor.apply();

                    Intent intent = new Intent(login_screen.this, customer_screen.class);
                    startActivity(intent);
                }
            }
                else {
                AlertDialog.Builder alert = new AlertDialog.Builder(login_screen.this);
                alert.setCancelable(false);
                alert.setTitle("Login Error");
                alert.setMessage("Invalid User ID and Password");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog aDialog = alert.create();
                aDialog.show();
            }
        }
    });
}
}

