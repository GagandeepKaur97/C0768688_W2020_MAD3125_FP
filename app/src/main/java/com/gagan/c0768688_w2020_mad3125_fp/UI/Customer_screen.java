package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;

public class Customer_screen extends AppCompatActivity {
    private TextView CustomerId;
    private TextView FullName;
    private TextView Email;
    private TextView TotalAmountToPay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
        CustomerId = findViewById(R.id.textView5);
        FullName = findViewById(R.id.textView6);
        Email = findViewById(R.id.textView7);
        TotalAmountToPay = findViewById(R.id.textView8);

        customer tobj = (customer) getIntent().getParcelableExtra("customers");

        CustomerId.setText(tobj.getCustomerId());
        FullName.setText(tobj.getFullName());
        Email.setText(tobj.getEmailId());
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
                Intent intent3 = new Intent(Customer_screen.this, newHydroBill.class);
                startActivity(intent3);

                return true;
            case R.id.menu4:

                Intent intent4 = new Intent(Customer_screen.this, newmobileBill.class);
                startActivity(intent4);
                return true;
            case R.id.menu5:

                Intent intent5 = new Intent(Customer_screen.this, newInternetBill.class);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
