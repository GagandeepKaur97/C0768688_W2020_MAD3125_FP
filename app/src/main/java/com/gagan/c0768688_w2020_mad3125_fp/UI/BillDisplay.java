package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.gagan.c0768688_w2020_mad3125_fp.Repo.StringExtension;
import com.gagan.c0768688_w2020_mad3125_fp.classes.Bill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.HydroBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.InternetBill;
import com.gagan.c0768688_w2020_mad3125_fp.classes.MobileBill;

public class BillDisplay extends AppCompatActivity {
    private TextView billtext;
    private ImageView billimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_display);

        billtext = findViewById(R.id.txtbillDisplay);
        billimg = findViewById(R.id.imgBilldisplay);

        Intent mIntent = getIntent();
        Bill billObj = (Bill) mIntent.getSerializableExtra("billOBJ");

        if(billObj.getBillType().matches("HYDRO"))
        {

            billimg.setImageResource(R.mipmap.ic_hydro);

            HydroBill hbillObj = (HydroBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+hbillObj.getBillId()+"\nBill Date    :   "+hbillObj.getBillDate()+"\nBill Type  :   "+hbillObj.getBillType()+"\nAgency Name    :   "+hbillObj.getAgencyname()+"\nUnits Consumed   :    "+hbillObj.getUnitsconsumed()+"\nBill Amount   :    "+ StringExtension.doubleFormatter(hbillObj.getTotalBillAmount()));

        }else if(billObj.getBillType().matches("MOBILE"))
        {
            billimg.setImageResource(R.mipmap.ic_mobile);

            MobileBill mbillObj = (MobileBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+mbillObj.getBillId()+"\nBill Date    :   "+mbillObj.getBillDate()+"\nBill Type  :   "+mbillObj.getBillType()+"\nMobile No    :   "+mbillObj.getMobileNo()+"\nModel Name  :   "+mbillObj.getMobilemanufacturer()+"\nPlan Name  :   "+mbillObj.getPlanname()+"\nInternet Used   :   "+mbillObj.getInternetGBused()+"\nMinutes used    :   "+mbillObj.getMinutesused()+"\nBill Amount  :   "+StringExtension.doubleFormatter(mbillObj.getTotalBillAmount()));

        }else if(billObj.getBillType().matches("INTERNET"))
        {
            billimg.setImageResource(R.mipmap.ic_internet);

           InternetBill ibillObj = (InternetBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+ibillObj.getBillId()+"\nBill Date    :   "+ibillObj.getBillDate()+"\nBill Type  :   "+ibillObj.getBillType()+"\nInternet Provider  :   "+ibillObj.getProvidername()+"\nInternet Used  :  "+ibillObj.getInternetGBused()+"\nBill Amount  :   "+StringExtension.doubleFormatter(ibillObj.getTotalBillAmount()));

        }else {

            billtext.setText("no bill found");
        }



    }
}
