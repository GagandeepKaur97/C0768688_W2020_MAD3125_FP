package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Customer_screen extends AppCompatActivity {
    private TextView CustomerId;
    private TextView FullName;
    private TextView Email;
    private TextView TotalAmountToPay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
    }
}
