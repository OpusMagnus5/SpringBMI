package com.damian.bodzioch.BMISpring.data;

import com.damian.bodzioch.BMISpring.bmi.BMI;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataBase {
    private ArrayList<BMI> bmiDataBase = new ArrayList<>();

    public void addBmiRecord(BMI bmiRecord) {
        this.bmiDataBase.add(bmiRecord);
    }

    public BMI getRecord(int id){
        return this.bmiDataBase.get(id);
    }

    public int getSizeDataBase(){
        return this.bmiDataBase.size();
    }
}
