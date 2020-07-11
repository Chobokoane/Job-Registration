package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit3);


        final Spinner spinnerSelectmenu = (Spinner)findViewById(R.id.spinner1);
        String[] items = {"Fixed type", "Contract"};
        ArrayAdapter<String> spinnerMenuList = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        spinnerMenuList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSelectmenu.setAdapter(spinnerMenuList);

        final Spinner spinnerSelectme = (Spinner)findViewById(R.id.spinner2);
        String[] item = {"Junior Post", "Senior Post"};
        ArrayAdapter<String> spinnerMenuLists = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, item);
        spinnerMenuLists.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSelectme.setAdapter(spinnerMenuLists);

        final Spinner spinnerSelect = (Spinner)findViewById(R.id.spinner3);
        String[] itemss = {"Advanced Diploma", "National Dimploma"};
        ArrayAdapter<String> spinnerMenu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, itemss);
        spinnerMenu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSelect.setAdapter(spinnerMenu);
    }
}
