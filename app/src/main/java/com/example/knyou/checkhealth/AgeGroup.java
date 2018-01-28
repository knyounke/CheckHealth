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
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(1,"Testicular Cancer (Monthly Check-up)");
            checkups.add(1,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Prostate Cancer (Once every 4 years)");
            checkups.add(1,"Screening for Lipid Disorders (Once every 2-3 Years)");
            checkups.add(1,"Electrocardiogram (Once a year)");
            checkups.add(1,"Coronary Heart Disease Screening (Once a year)");
            checkups.add(1,"Colonoscopy (Every 10 Years)");
            checkups.add(1,"CT colonography (Virtual Colonoscopy) (Every 5 years)");
            checkups.add(1,"Flexible Sigmoidoscopy (Every 5 years)");
            checkups.add(1,"Double-contrast Barium Enema (Every 5 years)");
            checkups.add(1,"Fecal immunochemical test (FIT) (Once a year)");
            checkups.add(1,"Guaiac-based fecal occult blood test (Once a year)");
            checkups.add(1,"Stool DNA Test (Once every 3 years)");
            checkups.add(1,"Vision Examination (Once a year)");
            checkups.add(1,"Hearing Examination (Once a year)");
            checkups.add(1,"Osteoporosis Screening  (Once every 8 years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Screening for Depression (Once a year)");
            checkups.add(1,"Alzheimer's disease and Dementia (Once every 5 years)");
            checkups.add(1,"Flu Vaccine (Once a year)");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years)");
        }
        else if(age_group == 6){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(1,"Testicular Cancer  (Monthly Check-up)");
            checkups.add(1,"Prostate Cancer (Once every 4 years)");
            checkups.add(1,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Screening for Lipid Disorders (Once every 2-3 Years)");
            checkups.add(1,"Electrocardiogram (Once a year)");
            checkups.add(1,"Coronary Heart Disease Screening (Once a year)");
            checkups.add(1,"Flexible Sigmoidoscopy (Every 5 years)");
            checkups.add(1,"Double-contrast Barium Enema (Every 5 years)");
            checkups.add(1,"Fecal immunochemical test (FIT) (Once a year)");
            checkups.add(1,"Guaiac-based fecal occult blood test (Once a year)");
            checkups.add(1,"Stool DNA Test (Once every 3 years)");
            checkups.add(1,"Vision Examination (Once a year)");
            checkups.add(1,"Hearing Examination (Once a year)");
            checkups.add(1,"Osteoporosis Screening  (Once every 8 years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Screening for Depression (Once a year)");
            checkups.add(1,"Alzheimer's disease and Dementia (Once every 5 years)");
            checkups.add(1,"Flu Vaccine (Once a year)");
        }
        /*
        * beginning of women
        * */
        else if(age_group == 7){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Pelvic Examination (Pap smear) (Once every 3 years)");
            checkups.add(1,"Lipid Panel Screening (Once every 5 years)");
            checkups.add(1,"Sexual Transmitted Diseases (Once every year)");
            checkups.add(1,"Breast Cancer (Once every 3 years)");
            checkups.add(1,"Breast Cancer  (Hereditary) (Once every year)");
            checkups.add(1,"Physical Examination (Once every year)");
            checkups.add(1,"Cholesterol Test (Once every four to six years)");
            checkups.add(1,"Blood Pressure Screening (Once every 1 to 2 years)");
            checkups.add(1,"Vision Examination (Once every year)");
            checkups.add(2,"Dental Exam (Once every 6 months)");
            checkups.add(1,"Flu Vaccine (Once a year)");
            checkups.add(1,"Tetanus-diphtheria booster (Once every 10 Years)");
            checkups.add(1,"Chlamydia Test (Once a year until age 25)");
        }
        else if(age_group == 8){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure Screening (Once every 1 to 2 years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Lipid Panel Screening (Once every 5 years)");
            checkups.add(1,"Cholesterol Test (Once every 5 years)");
            checkups.add(1,"Blood Sugar Test (Once every 3 years)");
            checkups.add(1,"Breast Exam (Once a year)");
            checkups.add(1,"Mammogram (Once every 2 years)");
            checkups.add(1,"Pelvic Examination (Pap smear) (Once every 3 years)");
        }
        else if(age_group == 9){
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Blood Pressure Screening (Once every 1 to 2 years)");
            checkups.add(1,"Lipid Panel Screening (Once every 5 years)");
            checkups.add(1,"Cholesterol Test (Once every 5 years)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Thyroid Test (Once every 5 years)");
            checkups.add(1,"Blood Sugar Test (Once every 3 years)");
            checkups.add(1,"Breast Exam (Once a year)");
            checkups.add(1,"Mammogram (Once every 1 - 2 years)");
            checkups.add(1,"Pelvic Examination (Pap smear) (Once every 3 years)");
            checkups.add(1,"Flexible Sigmoidoscopy (Once every 5 years)");
            checkups.add(1,"Fecal Occult Blood Test (Once every year)");
        }
        else if(age_group == 10){
            checkups.add(1,"Pelvic Examination (Pap smear) (Once every 3 years)");
            checkups.add(1,"Annual Physical Exam (Once a year)");
            checkups.add(1,"Sexually Transmitted Diseases (Once a year)");
            checkups.add(1,"Lipid Panel Screening (Once every 5 years)");
            checkups.add(1,"Mammogram (Once every 1 - 2 years)");
            checkups.add(1,"Breast Exam (Once a year)");
            checkups.add(1,"Blood Pressure (Once a year)");
            checkups.add(1,"Osteoporosis Screening (Once every 8 years)");
            checkups.add(1,"Hearing Examination (Once a year)");
            checkups.add(1,"Screening for Depression (Once a year)");
            checkups.add(1,"Blood Sugar Test (Once every 3 years)");
            checkups.add(1,"Thyroid Test (Once every 5 years)");
            checkups.add(1,"Cholesterol Test (Once every 5 years)");
            checkups.add(1,"Flexible Sigmoidoscopy (Once every 5 years)");
            checkups.add(1,"Fecal Occult Blood Test (Once every year)");

        }
    }

    private ArrayList checkups= new ArrayList();





}
