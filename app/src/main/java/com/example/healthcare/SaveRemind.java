package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.healthcare.databinding.ActivitySaveRemindBinding;

public class SaveRemind extends DrawerMenu {

    ActivitySaveRemindBinding activitySaveRemindBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_remind);
        activitySaveRemindBinding = ActivitySaveRemindBinding.inflate(getLayoutInflater());
        setContentView(activitySaveRemindBinding.getRoot());
        allocateActivityTitle("New Reminder");

        Button btnSaveR = findViewById(R.id.btnSaveR);
        btnSaveR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showReminderActivity();
            }
        });
    }

    private void showReminderActivity() {
        Intent intent = new Intent(this, Reminder.class);
        startActivity(intent);
        finish();
    }
}