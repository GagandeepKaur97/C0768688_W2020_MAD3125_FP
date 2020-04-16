package com.gagan.c0768688_w2020_mad3125_fp.customeradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.classes.Bill;

import java.util.ArrayList;

public class billsadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ArrayList<Bill> billArrayList;

    public billsadapter(ArrayList<Bill> billArrayList)
    {
        this.billArrayList = billArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bill_add, parent, false);
        billsadapter.billsViewHolder mBillsViewHolder = new billsadapter.billsViewHolder(mView);
        return mBillsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class billsViewHolder extends RecyclerView.ViewHolder {

        TextView txtCellBillId;
        TextView txtCellBillDate;
        TextView txtCellBillType;
        TextView txtCellBillAmount;
        public billsViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCellBillId = itemView.findViewById(R.id.txtCellBillId);
            txtCellBillDate = itemView.findViewById(R.id.txtCellBillDate);
            txtCellBillType = itemView.findViewById(R.id.txtCellBillType);
            txtCellBillAmount = itemView.findViewById(R.id.txtCellBillAmount);

}}}
