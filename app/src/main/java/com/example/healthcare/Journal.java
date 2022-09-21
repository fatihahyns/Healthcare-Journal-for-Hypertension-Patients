package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcare.databinding.ActivityJournalBinding;

public class Journal extends DrawerMenu {
    ActivityJournalBinding activityJournalBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityJournalBinding = ActivityJournalBinding.inflate(getLayoutInflater());
        setContentView(activityJournalBinding.getRoot());
        allocateActivityTitle("Journal");

//change page
        ImageButton btnAddJ = findViewById(R.id.imgAdd);
        btnAddJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddJournal();
            }
        });
    }

    //page change
    private void AddJournal(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    //end page change
}