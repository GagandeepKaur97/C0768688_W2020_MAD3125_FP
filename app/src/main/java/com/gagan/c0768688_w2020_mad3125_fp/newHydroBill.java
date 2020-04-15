package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}
