package com.example.healthcare;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.healthcare.databinding.ActivityRemindBinding;

import java.util.Calendar;

public class RemindActivity extends DrawerMenu {

    ActivityRemindBinding activityRemindBinding;
    Calendar calendar;
    TextView dateView;
    int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRemindBinding = ActivityRemindBinding.inflate(getLayoutInflater());
        setContentView(activityRemindBinding.getRoot());
        allocateActivityTitle("New Reminder");

        //Date
        dateView = (TextView) findViewById(R.id.tvDate);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);

        //change page
        Button btnSaveR = findViewById(R.id.btnSaveR);
        btnSaveR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showReminderActivity();
            }
        });

    }

    //Date
    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        //Toast.makeText(getApplicationContext(), "ca",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

    //end date

    //page change
    private void showReminderActivity(){
        Intent intent = new Intent(this, Reminder.class);
        startActivity(intent);
        finish();
    }
    //end page change
}
