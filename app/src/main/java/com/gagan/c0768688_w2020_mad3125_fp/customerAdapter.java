package com.gagan.c0768688_w2020_mad3125_fp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customerAdapter extends RecyclerView.Adapter<customerAdapter.customerviewholder> {
    private ArrayList<customer> customersArrayList;

    public customerAdapter(ArrayList<customer> customersArrayList) {
        this.customersArrayList = customersArrayList;
    }

    @NonNull
    @Override
    public customerAdapter.customerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull customerAdapter.customerviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;

    }

 public class customerviewholder extends RecyclerView.ViewHolder {
     TextView txtCustomerName;

     public customerviewholder(@NonNull View itemView) {
         super(itemView);

         txtCustomerName = itemView.findViewById(R.id.image_name);
     }
 }}
