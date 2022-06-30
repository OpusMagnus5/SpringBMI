package com.damian.bodzioch.BMISpring.bmi;

public class BMI {
    private double weight;
    private double height;
    private double bmi;
    private int id;
    private static int idCounter = 1;

    public BMI(double weight, double height, double bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = weight/Math.pow(height * 100, 2);
        this.id = idCounter++;
    }

    public BMI() {
    }
}
