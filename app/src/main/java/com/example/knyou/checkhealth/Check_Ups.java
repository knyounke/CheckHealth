package com.example.knyou.checkhealth;

/**
 * Created by jose on 1/27/18.
 */

public class Check_Ups {
    public Check_Ups(int total, String name){
        if(total != 0){
            _total_per_year = total;
            _completed_per_year = 0;
            _name = name;
        }
    }

    public void attendAppointment(){
        if (_completed_per_year <= _total_per_year){
            _completed_per_year++;
        }

    }

    public String getName(){
        return _name;
    }

    private int _total_per_year;
    private int _completed_per_year;
    private String _name;
}
