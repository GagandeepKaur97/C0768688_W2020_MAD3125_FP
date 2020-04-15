package com.gagan.c0768688_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class customer_screen<customer> extends AppCompatActivity {
    private RecyclerView recyclerViewcustom;
    private ArrayList<customer> customers;
    private customerlist customersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
        recyclerViewcustom = findViewById(R.id.recyclerview);

        customersInfo();

        customersAdapter = new customerlist(customers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerViewcustom.setLayoutManager(mLayoutManager);

        recyclerViewcustom.setAdapter(customersAdapter);
    }

    private void customersInfo(){
        customers = new ArrayList<>();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {         //https://javatpoint.com/android-option-menu-example

        getMenuInflater().inflate(R.menu.newcustomer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                Intent intent2 = new Intent(customer_screen.this, customer_screen.class);
                startActivity(intent2);

                return true;
            case R.id.menu2:

                Intent intent = new Intent(customer_screen.this, login_screen.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}






