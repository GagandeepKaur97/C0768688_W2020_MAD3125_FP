package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.StringExtension;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.customerRepo;
import com.gagan.c0768688_w2020_mad3125_fp.classes.Bill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.HydroBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.InternetBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.MobileBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class addNewBillActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private TextView billID;
    private TextView billDate;
    private TextView unitsUsed;
    private TextView agencyName;
    private TextView minutesUsed;
    private TextView manufacturerName;
    private TextView planName;
    private Spinner spbillType;
    private TextView mobilenumber;
    private TextView dataused;
    private FloatingActionButton fab;
    private TextView billamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bill);


        ActionBar actBar = getSupportActionBar();
        actBar.setTitle(" New Bill");

        fab = findViewById(R.id.fab);
        billID = findViewById(R.id.BillIDTextInputEditText);
        billDate = findViewById(R.id.BillDateTextInputEditText);
        unitsUsed = findViewById(R.id.enterunitsusedInputEditText);
        agencyName = findViewById(R.id.enteragencynameInputEditText);
        minutesUsed = findViewById(R.id.enterminutesusedInputEditText);
        manufacturerName = findViewById(R.id.entermanufacturernameInputEditText);
        planName = findViewById(R.id.enteryourplannameInputEditText);
        mobilenumber = findViewById(R.id.mobilenumberInputEditText);
        dataused = findViewById(R.id.datausedInputEditText);
        spbillType = findViewById(R.id.spinnertype);
       // billamount = findViewById(R.id.billAmountInputEditText);




        ArrayList<String> billType = new ArrayList<>();
        billType.add("MOBILE");
        billType.add("HYDRO");
        billType.add("INTERNET");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, billType);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spbillType.setAdapter(dataAdapter);

        spbillType.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        final Calendar myCalendar = Calendar.getInstance();
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                billDate.setText(sdf.format(myCalendar.getTime()));
                billDate.setTextColor(Color.BLACK);

            }

        };

        billDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(addNewBillActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }

        });






    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);

        if(position == 0)
        {
            initFields();
            clearfields();
            unitsUsed.setVisibility(View.INVISIBLE);
            agencyName.setVisibility(View.INVISIBLE);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(StringExtension.mobileValidation(mobilenumber.getText().toString()) == true) {

                        Intent mIntent = getIntent();
                        customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");


                        MobileBill tempmobile = new MobileBill(billID.getText().toString(), billDate.getText().toString(), spbillType.getSelectedItem().toString(),0.0, manufacturerName.getText().toString(), planName.getText().toString(), mobilenumber.getText().toString(), Integer.parseInt(dataused.getText().toString()), Integer.parseInt(minutesUsed.getText().toString()));

                        customerObj.addBill(tempmobile.getBillId(), tempmobile);

                        Intent intent3 = new Intent(addNewBillActivity.this, Customer_screen.class);

                        intent3.putExtra("CustomerOBJ", customerObj);

                        startActivity(intent3);
                    }else{
                        mobilenumber.setError("enter valid mobile number");
                    }


                }
            });
        }

        if(position == 1)
        {
            hidefields();
            clearfields();
            unitsUsed.setVisibility(View.VISIBLE);
            agencyName.setVisibility(View.VISIBLE);
            agencyName.setHint("ENTER AGENCY NAME");
//            unitsUsed.setHint("ENTER UNITS USED");
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mIntent = getIntent();
                    customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");


                    HydroBill tempHydro = new HydroBill(billID.getText().toString(),billDate.getText().toString(),spbillType.getSelectedItem().toString(),0.0,agencyName.getText().toString(),Integer.parseInt(unitsUsed.getText().toString()));

                    customerObj.addBill(tempHydro.getBillId(),tempHydro);
                    Intent intent3 = new Intent(addNewBillActivity.this,Customer_screen.class);

                    intent3.putExtra("CustomerOBJ",customerObj);

                    startActivity(intent3);






                }
            });
        }

        if(position == 2)
        {
            hidefields();
            clearfields();
            dataused.setVisibility(View.VISIBLE);
            agencyName.setVisibility(View.VISIBLE);
            agencyName.setHint("ENTER PROVIDER NAME");
//            unitsUsed.setHint("ENTER DATA USED");
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mIntent = getIntent();
                    customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");

                    InternetBill tempinternet = new InternetBill(billID.getText().toString(),billDate.getText().toString(),spbillType.getSelectedItem().toString(),0.0,agencyName.getText().toString(),Integer.parseInt(billamount.getText().toString()));


                    customerObj.addBill(tempinternet.getBillId(),tempinternet);
                    Intent intent3 = new Intent(addNewBillActivity.this,Customer_screen.class);

                    intent3.putExtra("CustomerOBJ",customerObj);

                    startActivity(intent3);



                }
            });
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void initFields()
    {
        minutesUsed.setVisibility(View.VISIBLE);
        mobilenumber.setVisibility(View.VISIBLE);
        dataused.setVisibility(View.VISIBLE);
        minutesUsed.setVisibility(View.VISIBLE);
        planName.setVisibility(View.VISIBLE);
        manufacturerName.setVisibility(View.VISIBLE);
    }
    public void hidefields()
    {
        minutesUsed.setVisibility(View.INVISIBLE);
        mobilenumber.setVisibility(View.INVISIBLE);
        dataused.setVisibility(View.INVISIBLE);
        minutesUsed.setVisibility(View.INVISIBLE);
        planName.setVisibility(View.INVISIBLE);
        manufacturerName.setVisibility(View.INVISIBLE);
    }

    public void clearfields()
    {
        mobilenumber.setText("");
        dataused.setText("");
        minutesUsed.setText("");
        planName.setText("");
        manufacturerName.setText("");
        billDate.setText("");
        billID.setText("");
        agencyName.setText("");
        dataused.setText("");
        unitsUsed.setText("");
    }
}

