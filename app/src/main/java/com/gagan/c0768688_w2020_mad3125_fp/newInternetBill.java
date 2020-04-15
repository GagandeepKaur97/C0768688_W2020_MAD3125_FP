package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        IRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iID = IBillID.getText().toString().trim();
                String iBillDate = IBillDate.getText().toString().trim();
                String providerName = ProviderName.getText().toString().trim();
                String iInternetUsage = IInternetUsage.getText().toString().trim();

                if(iID.isEmpty()){
                    IBillID.setError("Please enter Bill ID");
                } else if(iBillDate.isEmpty()){
                    IBillDate.setError("Please enter Bill Date");
                } else if(providerName.isEmpty()){
                    ProviderName.setError("Please enter Provider Name");
                } else if(iInternetUsage.isEmpty()){
                    IInternetUsage.setError("Please enter Internet Usage");
                } else {
                    Intent iint = new Intent(newInternetBill.this, Customer_screen.class);
                    startActivity(iint);
                }
            }
        });
    }
}
