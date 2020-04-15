package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class newHydroBill extends AppCompatActivity {
    private TextInputEditText HBillID;
    private TextInputEditText HBillDate;
    private TextInputEditText Agencyname;
    private TextInputEditText Unitsconsumed;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_hydro_bill);
        HBillID = findViewById(R.id.hydroBillIDt);
        HBillDate = findViewById(R.id.hydroBillDatet);
        Agencyname = findViewById(R.id.hydroAgencyNamet);
        Unitsconsumed = findViewById(R.id.hydroUnitConsumedt);
        register = findViewById(R.id.hydrobutton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hID = HBillID.getText().toString().trim();
                String hBillDate = HBillDate.getText().toString().trim();
                String agencyName = Agencyname.getText().toString().trim();
                String unitConsumed = Unitsconsumed.getText().toString().trim();

                if(hID.isEmpty()){
                    HBillID.setError("Please enter Bill ID");
                } else if(hBillDate.isEmpty()){
                    HBillDate.setError("Please enter Bill Date");
                } else if(agencyName.isEmpty()){
                    Agencyname.setError("Please enter Agency Name");
                } else if(unitConsumed.isEmpty()){
                    Unitsconsumed.setError("Please enter Unit Consumed");
                } else {
                    Intent hint = new Intent(newHydroBill.this,Customer_screen.class);
                    startActivity(hint);
                }
            }
        });
    }
}

