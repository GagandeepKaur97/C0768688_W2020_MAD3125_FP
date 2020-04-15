package com.gagan.c0768688_w2020_mad3125_fp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customerlist<Customer> extends RecyclerView.Adapter<customerlist.CustomerViewHolder> {
    private ArrayList<Customer> customersArrayList;

    public customerlist(ArrayList<Customer> customersArrayList) {
        this.customersArrayList = customersArrayList;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listcustomers, parent, false);
        CustomerViewHolder mCustomerViewHolder = new CustomerViewHolder(mView);
        return mCustomerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final customerlist.CustomerViewHolder holder, final int position) {
        Customer mCustomer = this.customersArrayList.get(position);
        holder.txtCustomerName.setText(mCustomer.getFullName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer cust = customersArrayList.get(position);
                Intent sint = new Intent(holder.itemView.getContext(), details_customers.class);
                sint.putExtra("customers", (Bundle) cust);
                holder.itemView.getContext().startActivity(sint);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.customersArrayList.size();
    }

    public class CustomerViewHolder extends RecyclerView.ViewHolder{
        TextView txtCustomerName;

        public CustomerViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCustomerName = itemView.findViewById(R.id.image_name);
        }
    }
}


