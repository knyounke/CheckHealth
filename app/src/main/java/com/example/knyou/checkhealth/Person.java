package com.example.knyou.checkhealth;
import com.example.knyou.checkhealth.AgeGroup;
/**
 * Created by jose on 1/27/18.
 */

public class Person {
    public Person(String sex, int age){
        if(age >= 0 && (sex =="Male" || sex =="Female")){
            _age = age;
            _sex = sex;
            _set_group();
        }
    }

    public void _set_group(){
        if(_age <= 2){
            age_group = new AgeGroup(0);
        }
        else if(_age >=20 && _age<30){
            age_group = new AgeGroup(1);
        }
        else if(_age >=40 && _age<50){
            age_group = new AgeGroup(2);
        }
        else if(_age >=20 && _age<60){
            age_group = new AgeGroup(3);
        }
        else if(_age >=60 && _age<70){
            age_group = new AgeGroup(4);
        }
        else if(_age >=80 && _age<90){
            age_group = new AgeGroup(5);
        }
    }


    private AgeGroup age_group;
    private String _sex;
    private int _age;
}
