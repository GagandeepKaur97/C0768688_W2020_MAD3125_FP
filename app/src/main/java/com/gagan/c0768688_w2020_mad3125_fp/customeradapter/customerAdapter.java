package com.gagan.c0768688_w2020_mad3125_fp.customeradapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.customerRepo;
import com.gagan.c0768688_w2020_mad3125_fp.classes.customer;

import java.util.ArrayList;

import com.gagan.c0768688_w2020_mad3125_fp.UI.Customer_screen;

public class customerAdapter extends RecyclerView.Adapter<customerAdapter.customerviewholder> {
//    private ArrayList<customer> customersArrayList;
//
//    public customerAdapter(ArrayList<customer> customersArrayList) {
//        this.customersArrayList = customersArrayList;
//    }

    @NonNull
    @Override
    public customerAdapter.customerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listcustomers, parent, false);
        customerviewholder mCustomerViewHolder = new customerviewholder(mView);
        return mCustomerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final customerAdapter.customerviewholder holder, final int position) {
        customer mCustomer = customerRepo.getInstance().getCustomers().get(position);
        holder.txtCustomerName.setText(mCustomer.getFullName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer cust = customerRepo.getInstance().getCustomers().get(position);
                Intent sint = new Intent(holder.itemView.getContext(), Customer_screen.class);
                sint.putExtra("CustomerOBJ", cust);
                holder.itemView.getContext().startActivity(sint);
            }
        });
    }

    @Override
    public int getItemCount() {
        return customerRepo.getInstance().getCustomers().size();
    }

 public class customerviewholder extends RecyclerView.ViewHolder {
     TextView txtCustomerName;

     public customerviewholder(@NonNull View itemView) {
         super(itemView);

         txtCustomerName = itemView.findViewById(R.id.image_name);
     }
 }}
