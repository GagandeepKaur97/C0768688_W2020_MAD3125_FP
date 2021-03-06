package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.StringExtension;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.customerRepo;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;
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
        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Add New Customer");
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
                } else if((StringExtension.emailValidation(edtCEmail.getText().toString())) == true)
                {
                    customer tempObj = new customer(edtCustomerID.getText().toString(),edtFirstName.getText().toString(),edtLastName.getText().toString(),edtCEmail.getText().toString());
                    customerRepo.getInstance().addcustomer(tempObj);
                    finish();

//                } else if()  {
//                    AlertDialog.Builder alert = new AlertDialog.Builder(details_customers.this);
//                    alert.setCancelable(false);
//                    alert.setTitle("New Customer Creation Error");
//                    alert.setMessage("Invalid Email");
//                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.dismiss();
//                        }
//                    });
//                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.cancel();
//                        }
//                    });
//                    AlertDialog aDialog = alert.create();
//                    aDialog.show();
                } else  {
                    edtCEmail.setError("enter Valid email!");
                }

            }
        });
    }
}


