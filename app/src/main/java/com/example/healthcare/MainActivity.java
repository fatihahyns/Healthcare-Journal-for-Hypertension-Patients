package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcare.databinding.ActivityJournalBinding;
import com.example.healthcare.databinding.ActivityMainBinding;

public class MainActivity extends DrawerMenu {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        allocateActivityTitle("Home");

        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveButton();
            }
        });
    }

    private void saveButton(){
        Intent intent = new Intent(this, Journal.class);
        startActivity(intent);
        finish();
    }
}
