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
        CustomerId = findViewById(R.id.textView5);
        FullName = findViewById(R.id.textView6);
        Email = findViewById(R.id.textView7);
        TotalAmountToPay = findViewById(R.id.textView8);

        customer tobj = (customer) getIntent().getSerializableExtra("customers");

        CustomerId.setText(tobj.getCustomerId());
        FullName.setText(tobj.getFullName());
        Email.setText(tobj.getEmail());
    }

    }

