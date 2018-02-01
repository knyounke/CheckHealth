package com.example.knyou.checkhealth;
//import com.example.knyou.checkhealth.AgeGroup;

import java.util.ArrayList;

/**
 * Created by jose on 1/27/18.....
 */

public class Person {
    public Person(String gender, int age){
        if(age >= 0 && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))){
            _age = age;
            _gender = gender;
            _set_group();
        }
    }

    public void _set_group(){
        if(_gender == "MALE") {
            if (_age >= 20 && _age < 30) {
                _age_group = new AgeGroup(1, _gender);
            } else if (_age >= 30 && _age < 40) {
                _age_group = new AgeGroup(2, _gender);
            } else if (_age >= 40 && _age < 50) {
                _age_group = new AgeGroup(3, _gender);
            } else if (_age >= 50 && _age < 60) {
                _age_group = new AgeGroup(4, _gender);
            } else if (_age >= 60 && _age < 70) {
                _age_group = new AgeGroup(5, _gender);
            } else if (_age >= 70) {
                _age_group = new AgeGroup(6, _gender);
            }
        }
        else {
            if (_age >= 18 && _age < 30) {
                _age_group = new AgeGroup(7, _gender);
            } else if (_age >= 40 && _age < 50) {
                _age_group = new AgeGroup(8, _gender);
            } else if (_age >= 50 && _age < 60) {
                _age_group = new AgeGroup(9, _gender);
            } else if (_age >= 60) {
                _age_group = new AgeGroup(10, _gender);
            }
        }
    }

    private AgeGroup _age_group;
    private ArrayList _check_ups;
    private String _gender;
    private int _age;


    public AgeGroup get_age_group() {
        return _age_group;
    }
    public String get_gender() {
        return _gender;
    }
    public ArrayList get_check_ups() {
        return _check_ups;
    }

}
