package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class details_customers extends AppCompatActivity {
    private TextInputEditText edtCustomerID;
    private TextInputEditText edtFirstName;
    private TextInputEditText edtLastName;
    private TextInputEditText edtCEmail;
    private Button CSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_customers);
        edtCustomerID = findViewById(R.id.customerIDTextInputEditText);
        edtFirstName = findViewById(R.id.firstNameTextInputEditText);
        edtLastName = findViewById(R.id.lastNameTextInputEditText);
        edtCEmail = findViewById(R.id.customerEmailTextInputEditText);
        CSave = findViewById(R.id.customerbutton);

        CSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cID = edtCustomerID.getText().toString().trim();
                String fName = edtFirstName.getText().toString().trim();
                String lName = edtLastName.getText().toString().trim();
                String cEmail = edtCEmail.getText().toString().trim();

                if(cID.isEmpty()){
                    edtCustomerID.setError("Please enter Customer ID");
                } else if(fName.isEmpty()){
                    edtFirstName.setError("Please enter First Name");
                } else if(lName.isEmpty()){
                    edtLastName.setError("Please enter Last Name");
                } else if(cEmail.isEmpty()){
                    edtCEmail.setError("Please enter email");
                } else {
                    Intent cint = new Intent(details_customers.this, details_customers.class);
                    startActivity(cint);
                }
            }
        });
    }
}
