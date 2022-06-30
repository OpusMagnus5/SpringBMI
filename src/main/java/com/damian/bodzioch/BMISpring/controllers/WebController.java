package com.damian.bodzioch.BMISpring.controllers;

import com.damian.bodzioch.BMISpring.bmi.BMI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("bmiRecord", new BMI());
        return "form";
    }

}
