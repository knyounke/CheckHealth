package com.example.knyou.checkhealth;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;
import android.widget.Button;
import android.widget.Spinner;
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //to get Name info
        @SuppressLint("WrongViewCast") Button btn = (Button)findViewById(R.id.Name);
        String name = (String)btn.getText();

        //to get Age info
        @SuppressLint("WrongViewCast") Button btn2 = (Button)findViewById(R.id.Age);
        String age = (String)btn2.getText();


        //to get Gender info
        Spinner spinner = (Spinner)findViewById(R.id.Gender);
        String gender = (String) spinner.getSelectedItem();

        //to get BDAY info
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Object item = adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

}
