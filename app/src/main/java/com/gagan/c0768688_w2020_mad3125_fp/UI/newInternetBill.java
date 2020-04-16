package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        IBillDate.setOnClickListener(new View.OnClickListener() {        //https://www.journaldev.com/9976/android-date-time-picker-dialog
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(newInternetBill.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {       //https://android--code.blogspot.com/2015/08/android-datepickerdialog-date-format.html
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year, month, dayOfMonth);
                        Date date = calendar.getTime();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                        String s = dateFormat.format(date);
                        IBillDate.setText(s);
                    }
                }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }
        });
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
