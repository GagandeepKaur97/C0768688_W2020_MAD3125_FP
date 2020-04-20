package com.gagan.c0768688_w2020_mad3125_fp.customeradapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.StringExtension;
import com.gagan.c0768688_w2020_mad3125_fp.UI.BillDisplay;
import com.gagan.c0768688_w2020_mad3125_fp.classes.Bill;

import java.util.ArrayList;

public class billsadapter extends RecyclerView.Adapter<billsadapter.ViewHolder> {
    private static ArrayList<Bill> billArrayList;

    public billsadapter(ArrayList<Bill> billArrayList)
    {
        this.billArrayList = billArrayList;
    }

    public billsadapter() {

    }

    @NonNull
    @Override
    public billsadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bill_add, parent, false);
        billsadapter.ViewHolder mBillsViewHolder = new billsadapter.ViewHolder(mView);
        return mBillsViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull final billsadapter.ViewHolder holder, int position) {
        final Bill mBills = this.billArrayList.get(position);
        holder.txtCellBillId.setText(mBills.getBillId());
        holder.txtCellBillAmount.setText(StringExtension.doubleFormatter(mBills.getTotalBillAmount()));
        holder.txtCellBillDate.setText(mBills.getBillDate().toString());
        holder.txtCellBillType.setText(mBills.getBillType().toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntent = new Intent(holder.itemView.getContext(), BillDisplay.class);
                mIntent.putExtra("billOBJ",mBills);
                holder.itemView.getContext().startActivity(mIntent);

            }
        });

    }



    @Override
    public int getItemCount()  {
        return this.billArrayList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtCellBillId;
        TextView txtCellBillDate;
        TextView txtCellBillType;
        TextView txtCellBillAmount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCellBillId = itemView.findViewById(R.id.lblCellId);
            txtCellBillDate = itemView.findViewById(R.id.txtCellBillDate);
            txtCellBillType = itemView.findViewById(R.id.txtCellBillType);
            txtCellBillAmount = itemView.findViewById(R.id.txtCellBillAmount);

}

    }
}
