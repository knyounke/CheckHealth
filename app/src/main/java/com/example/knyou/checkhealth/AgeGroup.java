package com.example.knyou.checkhealth;

import java.util.ArrayList;

/**
 * Created by jose on 1/27/18.
 */

public class AgeGroup {

    public AgeGroup(int age_group){
        if(age_group == 1){
            checkups.add(1,"Annual Physical Exam (Once a year)\n");
            checkups.add(1,"Blood Pressure (Once a year)\n");
            checkups.add(12,"Testicular Cancer  (Monthly Check-up)\n");
            checkups.add(1,"Vision Examination (Once a year)\n");
            checkups.add(2,"Dental Exam (Once every 6 months)\n");
            checkups.add(1,"Cholesterol Testing (Every 5 years)\n");
            checkups.add(1,"Heart Disease Check-up (Once a year)\n");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)\n");
            checkups.add(1,"Flu Vaccine (Once a year)\n");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years)\n");
        }
        else if(age_group == 2){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(2,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Testicular Cancer  (Monthly Check-up)");
            checkups.add(1,"Cholesterol Testing (Every 5 years)");
            checkups.add(1,"Heart Disease Check-up (Once a year)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Vision Examination (Once a year)");
            checkups.add(1,"Coronary Heart Disease Screening (Once a year)");
            checkups.add(1,"Flu Vaccine (Once a year)");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years)");
        }
        else if(age_group ==3){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(12,"Testicular Cancer  (Monthly Check-up)");
            checkups.add(2,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Cholesterol Testing (Every 5 years)");
            checkups.add(1,"Heart Disease Check-up (Once a year)");
            checkups.add(1,"Prostate Cancer (Once every 4 years)");
            checkups.add(1,"Diabetes Screening (Once every 3 years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Vision Examination (Once a year)");
            checkups.add(1,"Coronary Heart Disease Screening (Once a year)");
            checkups.add(1,"Flu Vaccine (Once a year)");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years))");
        }
        else if(age_group == 4){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(12,"Testicular Cancer  (Monthly Check-up)");
            checkups.add(2,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Cholesterol Testing (Every 5 years)");
            checkups.add(1,"Type II Diabetes Screening (Every 2 Years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)" );
            checkups.add(1,"Screening for Lipid Disorders (Once every 2-3 Years)");
            checkups.add(1,"Electrocardiogram (Once a year)");
            checkups.add(1,"Vision Examination (Once a year)");
            checkups.add(1,"Hearing Examination (Once a year)");
            checkups.add(1,"Prostate Cancer (Once every 4 years)");
            checkups.add(1,"Colonoscopy (Every 10 Years)");
            checkups.add(1,"CT colonography (Virtual Colonoscopy) (Every 5 years)");
            checkups.add(1,"Flexible Sigmoidoscopy (Every 5 years)");
            checkups.add(1,"Double-contrast Barium Enema (Every 5 years)");
            checkups.add(1,"Fecal immunochemical test (FIT) (Once a year)");
            checkups.add(1,"Guaiac-based fecal occult blood test (Once a year)");
            checkups.add(1,"Stool DNA Test (Once every 3 years)");
            checkups.add(1,"Coronary Heart Disease Screening (Once a year)");
            checkups.add(1,"Screening for Depression (Once a year)");
            checkups.add(1,"Flu Vaccine (Once a year)");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years)");
        }
        else if(age_group == 5){
            checkups.add("Annual Physical Exam (Once a year)");
            checkups.add("Blood Pressure (Once a year)");
            checkups.add("Testicular Cancer  (Monthly Check-up)");
            checkups.add("Dental Exam (Once every 6 months)");
            checkups.add("Prostate Cancer (Once every 4 years)");
            checkups.add("Screening for Lipid Disorders (Once every 2-3 Years)");
            checkups.add("Electrocardiogram (Once a year)");
            checkups.add("Coronary Heart Disease Screening (Once a year)");
            checkups.add("Colonoscopy (Every 10 Years)");
            checkups.add("CT colonography (Virtual Colonoscopy) (Every 5 years)");
            checkups.add("Flexible Sigmoidoscopy (Every 5 years)");
            checkups.add("Double-contrast Barium Enema (Every 5 years)");
            checkups.add("Fecal immunochemical test (FIT) (Once a year)");
            checkups.add("Guaiac-based fecal occult blood test (Once a year)");
            checkups.add("Stool DNA Test (Once every 3 years)");
            checkups.add("Vision Examination (Once a year)");
            checkups.add("Hearing Examination (Once a year)");
            checkups.add("Osteoporosis Screening  (Once every 8 years)");
            checkups.add("Sexually Transmitted Diseases (Once a year)");
            checkups.add("Screening for Depression (Once a year)");
            checkups.add("Alzheimer's disease and Dementia (Once every 5 years)");
            checkups.add("Flu Vaccine (Once a year)");
            checkups.add("Tetanus-diphtheria booster (Once every 10 Years)");
        }

    }

    private ArrayList checkups= new ArrayList();





}
