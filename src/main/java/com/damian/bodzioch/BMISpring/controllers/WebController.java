package com.damian.bodzioch.BMISpring.controllers;

import com.damian.bodzioch.BMISpring.bmi.BMI;
import com.damian.bodzioch.BMISpring.data.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    DataBase dataBase;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("bmiRecord", new BMI());
        return "form";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String main(BMI bmiRecord, Model model){
        bmiRecord.setId();
        bmiRecord.setBmi();
        bmiRecord.setNameResult();
        this.dataBase.addBmiRecord(bmiRecord);
        model.addAttribute("bmiRecord", this.dataBase.getRecord(bmiRecord.getId() - 1));
        return "bmiResult";
    }

    @RequestMapping(value = "/showBmiRecordById", method = RequestMethod.POST)
    public String showBmiRecordById(@RequestParam int id, Model model){
        if (id > this.dataBase.getSizeDataBase()){
            model.addAttribute("bmiRecord", null);
        }else{
            model.addAttribute("bmiRecord", this.dataBase.getRecord(id - 1));
        }
        return "bmiRecordByID";
    }
}
