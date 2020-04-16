package UI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.gagan.c0768688_w2020_mad3125_fp.R;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class newHydroBill extends AppCompatActivity {
    private TextInputEditText HBillID;
    private TextInputEditText HBillDate;
    private TextInputEditText Agencyname;
    private TextInputEditText Unitsconsumed;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_hydro_bill);
        HBillID = findViewById(R.id.hydroBillIDt);
        HBillDate = findViewById(R.id.hydroBillDatet);

        HBillDate.setOnClickListener(new View.OnClickListener() {        //https://www.journaldev.com/9976/android-date-time-picker-dialog
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(newHydroBill.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {       //https://android--code.blogspot.com/2015/08/android-datepickerdialog-date-format.html
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year, month, dayOfMonth);
                        Date date = calendar.getTime();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                        String s = dateFormat.format(date);
                        HBillDate.setText(s);
                    }
                }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }
        });
        Agencyname = findViewById(R.id.hydroAgencyNamet);
        Unitsconsumed = findViewById(R.id.hydroUnitConsumedt);
        register = findViewById(R.id.hydrobutton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hID = HBillID.getText().toString().trim();
                String hBillDate = HBillDate.getText().toString().trim();
                String agencyName = Agencyname.getText().toString().trim();
                String unitConsumed = Unitsconsumed.getText().toString().trim();

                if(hID.isEmpty()){
                    HBillID.setError("Please enter Bill ID");
                } else if(hBillDate.isEmpty()){
                    HBillDate.setError("Please enter Bill Date");
                } else if(agencyName.isEmpty()){
                    Agencyname.setError("Please enter Agency Name");
                } else if(unitConsumed.isEmpty()){
                    Unitsconsumed.setError("Please enter Unit Consumed");
                } else {
                    Intent hint = new Intent(newHydroBill.this, Customer_screen.class);
                    startActivity(hint);
                }
            }
        });
    }
}

