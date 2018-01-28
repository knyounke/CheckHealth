package com.example.knyou.checkhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        //calendar
        Calendar c= Calendar.getInstance();
        int year= c.get(c.YEAR);
        int month = c.get(c.MONTH);
        int dayOfMonth = c.get(c.DAY_OF_MONTH);
        
        //get widgets reference of calendar

        DatePicker BDay = (DatePicker)findViewById(R.id.BDay);
        
        //init(int year, int monthofyear, int dayofmonth, datepicker.ondatelistener
        
        /*BDay.init{
            year,
            month,
            dayOfMonth,
            new DatePicker.OnDateChangedListener() {
           @Override
           public void onDateChanged() {

           }
            };

        }*/
    }
}
