package UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import classes.customer;
import customeradapter.customerAdapter;
import Repo.customerRepo;

import java.util.ArrayList;

public class list_of_customers extends AppCompatActivity {
    private RecyclerView rvCustomerslist;
    private ArrayList<customer> customers;
    private customeradapter.customerAdapter customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_customers);
         rvCustomerslist = findViewById(R.id.rvcustomerlist);

        customersInfo();

        customerAdapter = new customerAdapter(customers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvCustomerslist.setLayoutManager(mLayoutManager);

        rvCustomerslist.setAdapter(customerAdapter);
    }

    private void customersInfo() {
        customerRepo.getInstance().loadDetails();
        customers = new ArrayList<>(customerRepo.getInstance().getCustomer());
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
                Intent intent2 = new Intent(list_of_customers.this, details_customers.class);
                startActivity(intent2);

                return true;
            case R.id.menu2:

                Intent intent = new Intent(list_of_customers.this, login_screen.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
