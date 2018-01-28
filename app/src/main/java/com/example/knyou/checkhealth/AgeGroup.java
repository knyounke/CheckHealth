package com.example.knyou.checkhealth;

import java.util.ArrayList;

/**
 * Created by jose on 1/27/18.
 */

public class AgeGroup {

    public AgeGroup(int age_group){
        if(age_group == 1){
            checkups.add("Annual Physical Exam (Once a year)\n");
            checkups.add("Blood Pressure (Once a year)\n");
            checkups.add("Testicular Cancer  (Monthly Check-up)\n");
            checkups.add("Vision Examination (Once a year)\n");
            checkups.add("Dental Exam (Once every 6 months)\n");
            checkups.add("Cholesterol Testing (Every 5 years)\n");
            checkups.add("Heart Disease Check-up (Once a year)\n");
            checkups.add("Sexually Transmitted Diseases (Once a year)\n");
            checkups.add("Flu Vaccine (Once a year)\n");
            checkups.add("Tetanus-diphtheria booster (Once every 10 Years)\n");
        }
        else if(age_group == 2){
            checkups.add("Annual Physical Exam (Once a year)");
            checkups.add("Blood Pressure (Once a year)");
            checkups.add("Dental Exam (Once every 6 months)");
            checkups.add("Testicular Cancer  (Monthly Check-up)");
            checkups.add("Cholesterol Testing (Every 5 years)");
            checkups.add("Heart Disease Check-up (Once a year)");
            checkups.add("Sexually Transmitted Diseases (Once a year)");
            checkups.add("Vision Examination (Once a year)");
            checkups.add("Coronary Heart Disease Screening (Once a year)");
            checkups.add("Flu Vaccine (Once a year)");
            checkups.add("Tetanus-diphtheria booster (Once every 10 Years)");
        }
        else if(age_group ==3){
            checkups.add("Annual Physical Exam (Once a year)");
            checkups.add("Blood Pressure (Once a year)");
            checkups.add("Testicular Cancer  (Monthly Check-up)");
            checkups.add("Dental Exam (Once every 6 months)");
            checkups.add("Cholesterol Testing (Every 5 years)");
            checkups.add("Heart Disease Check-up (Once a year)");
            checkups.add("Prostate Cancer (Once every 4 years)");
            checkups.add("Diabetes Screening (Once every 3 years)");
            checkups.add("Sexually Transmitted Diseases (Once a year)");
            checkups.add("Vision Examination (Once a year)");
            checkups.add("Coronary Heart Disease Screening (Once a year)");
            checkups.add("Flu Vaccine (Once a year)");
            checkups.add("Tetanus-diphtheria booster (Once every 10 Years))");
        }

    }

    private ArrayList checkups= new ArrayList();





}
