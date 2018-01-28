package com.example.knyou.checkhealth;
//import com.example.knyou.checkhealth.AgeGroup;

import java.util.ArrayList;

/**
 * Created by jose on 1/27/18.....
 */

public class Person {
    public Person(String sex, int age){
        if(age >= 0 && (sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female"))){
            _age = age;
            _sex = sex;
            _set_group();
        }
    }

    public void _set_group(){
        if(_sex == "MALE") {
            if (_age >= 20 && _age < 30) {
                _age_group = new AgeGroup(1, _sex);
            } else if (_age >= 30 && _age < 40) {
                _age_group = new AgeGroup(2, _sex);
            } else if (_age >= 40 && _age < 50) {
                _age_group = new AgeGroup(3, _sex);
            } else if (_age >= 50 && _age < 60) {
                _age_group = new AgeGroup(4, _sex);
            } else if (_age >= 60 && _age < 70) {
                _age_group = new AgeGroup(5, _sex);
            } else if (_age >= 70) {
                _age_group = new AgeGroup(6, _sex);
            }
        }
        else {
            if (_age >= 18 && _age < 30) {
                _age_group = new AgeGroup(7, _sex);
            } else if (_age >= 40 && _age < 50) {
                _age_group = new AgeGroup(8, _sex);
            } else if (_age >= 50 && _age < 60) {
                _age_group = new AgeGroup(9, _sex);
            } else if (_age >= 60) {
                _age_group = new AgeGroup(10, _sex);
            }
        }
    }

    private AgeGroup _age_group;
    private ArrayList _check_ups;
    private String _sex;
    private int _age;


    public AgeGroup get_age_group() {
        return _age_group;
    }
    public String get_sex() {
        return _sex;
    }
    public ArrayList get_check_ups() {
        return _check_ups;
    }

}
