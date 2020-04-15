package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class newmobileBill extends AppCompatActivity {
    private TextInputEditText MBillID;
    private TextInputEditText MBillDate;
    private TextInputEditText ManufacturerName;
    private TextInputEditText PlanName;
    private TextInputEditText MobileNumber;
    private TextInputEditText MInternetUsage;
    private TextInputEditText MinutesUsage;
    private Button MRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmobile_bill);
        MBillID = findViewById(R.id.mobileBillIDt);
        MBillDate = findViewById(R.id.mobileBillDatet);
        ManufacturerName = findViewById(R.id.mobileManufacturerNamet);
        PlanName = findViewById(R.id.mobilePlanNamet);
        MobileNumber = findViewById(R.id.mobileMobileNumbert);
        MInternetUsage = findViewById(R.id.internetInternetUsaget);
        MinutesUsage = findViewById(R.id.mobileMinutesUsaget);
        MRegister = findViewById(R.id.mobilebutton);
    }
}
