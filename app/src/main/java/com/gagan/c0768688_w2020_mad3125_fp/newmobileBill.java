package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        MRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mID = MBillID.getText().toString().trim();
                String mBillDate = MBillDate.getText().toString().trim();
                String manufacturerName = ManufacturerName.getText().toString().trim();
                String planName = PlanName.getText().toString().trim();
                String mobileNumber = MobileNumber.getText().toString().trim();
                String mInternetUsage = MInternetUsage.getText().toString().trim();
                String minutesUsage = MinutesUsage.getText().toString().trim();

                if(mID.isEmpty()){
                    MBillID.setError("Please enter Bill ID");
                } else if(mBillDate.isEmpty()){
                    MBillDate.setError("Please enter Bill Date");
                } else if(manufacturerName.isEmpty()){
                    ManufacturerName.setError("Please enter Manufacturer Name");
                } else if(planName.isEmpty()){
                    PlanName.setError("Please enter Plan Name");
                } else if(mobileNumber.isEmpty()){
                    MobileNumber.setError("Please enter Mobile Number");
                } else if(mInternetUsage.isEmpty()){
                    MInternetUsage.setError("Please enter Internet Usage");
                } else if(minutesUsage.isEmpty()){
                    MinutesUsage.setError("Please enter Minutes Usage");
                } else {
                    Intent mint = new Intent(newmobileBill.this, Customer_screen.class);
                    startActivity(mint);
                }
            }
        });
    }
}
