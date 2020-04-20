package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.StringExtension;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;
import com.gagan.c0768688_w2020_mad3125_fp.customeradapter.billsadapter;

import java.util.ArrayList;

public class Customer_screen extends AppCompatActivity {
    private TextView CustomerId;
    private TextView FullName;
    private TextView Email;
    private TextView TotalAmountToPay;

    private RecyclerView rvBills;
    private billsadapter Billsadapter;
    private ArrayList billsArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
        CustomerId = findViewById(R.id.txtCustomerId);
        FullName = findViewById(R.id.txtCustomerName);
        Email = findViewById(R.id.txtCustomerEmail);
        TotalAmountToPay = findViewById(R.id.txtCustomerTotalAmount);
        rvBills = findViewById(R.id.rvbills);



        customersInfo();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        customersInfo();

    }

    private void customersInfo() {

        Intent mIntent = getIntent();

        customer tobj = mIntent.getParcelableExtra("CustomerOBJ");

        billsArray = tobj.getBills();




        Billsadapter = new billsadapter(this.billsArray);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvBills.setLayoutManager(mLayoutManager);

        rvBills.setAdapter((RecyclerView.Adapter) Billsadapter);


        CustomerId.setText(tobj.getCustomerId());
        FullName.setText(tobj.getFullName());
        Email.setText(tobj.getEmailId());
        TotalAmountToPay.setText(StringExtension.doubleFormatter(tobj.getTotalAmount()));



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {         //https://javatpoint.com/android-option-menu-example

        getMenuInflater().inflate(R.menu.add_bill, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu3:

                Intent mIntent = getIntent();
                customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");
                Intent intent3 = new Intent(Customer_screen.this, addNewBillActivity.class);
                intent3.putExtra("CustomerOBJ",customerObj);
                startActivity(intent3);

                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
