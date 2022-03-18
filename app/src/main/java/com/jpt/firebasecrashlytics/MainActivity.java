package com.jpt.firebasecrashlytics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button crashButton = new Button(this);
        crashButton.setText("Test Crash");
        crashButton.setOnClickListener(view -> {
            throw new RuntimeException("Test Crash");
        });
        addContentView(crashButton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }
}