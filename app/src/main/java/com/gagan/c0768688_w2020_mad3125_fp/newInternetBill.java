package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class newInternetBill extends AppCompatActivity {

    private TextInputEditText IBillID;
    private TextInputEditText IBillDate;
    private TextInputEditText ProviderName;
    private TextInputEditText IInternetUsage;
    private Button IRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_internet_bill);
        IBillID = findViewById(R.id.internetBillIDt);
        IBillDate = findViewById(R.id.internetBillDatet);
        ProviderName = findViewById(R.id.internetProviderNamet);
        IInternetUsage = findViewById(R.id.internetInternetUsaget);
        IRegister = findViewById(R.id.internetbutton);
    }
}
