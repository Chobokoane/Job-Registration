package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Spinner spinnerSelectmenu = (Spinner)findViewById(R.id.spinner1);
        String[] items = {"Information Technology", "Financial Information Technology"};
        ArrayAdapter<String> spinnerMenuList = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        spinnerMenuList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSelectmenu.setAdapter(spinnerMenuList);
    }
}
