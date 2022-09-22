package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.healthcare.databinding.ActivityReminderBinding;

public class Reminder extends DrawerMenu {

    ActivityReminderBinding activityReminderBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityReminderBinding = ActivityReminderBinding.inflate(getLayoutInflater());
        setContentView(activityReminderBinding.getRoot());
        allocateActivityTitle("Reminder");

        //change page
        ImageButton btnAddReminder = findViewById(R.id.btnAddReminder);
        btnAddReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddRemind();
            }
        });
    }

    //page change
    private void AddRemind(){
        Intent intent = new Intent(Reminder.this, RemindActivity.class);
        startActivity(intent);
        finish();
    }
    //end page change
}
