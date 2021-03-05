package com.example.cours7_apptesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.AM_change_btn).setOnClickListener( v -> {
            ((TextView)findViewById(R.id.AM_name_tv)).setText(((EditText)findViewById(R.id.AM_name_et)).getText().toString());
        });
    }
}