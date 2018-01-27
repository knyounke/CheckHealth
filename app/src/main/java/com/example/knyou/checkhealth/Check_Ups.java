package com.example.knyou.checkhealth;

/**
 * Created by jose on 1/27/18.
 */

public class Check_Ups {
    public Check_Ups(int total, String description){
        if(total != 0){
            _total_per_year = total;
            _completed_per_year = 0;
            _description = description;
        }
    }

    public void attendAppointment(){
        if (_completed_per_year <= _total_per_year){
            _completed_per_year++;
        }
    }

    public String viewDescription(){
        return _description;
    }

    private int _total_per_year;
    private int _completed_per_year;
    private String _description;
}
