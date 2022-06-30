package com.damian.bodzioch.BMISpring.bmi;

public class BMI {
    private double weight;
    private double height;
    private double bmi;
    private String nameResult;
    private int id;
    private static int idCounter = 1;

    public BMI() {
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return this.bmi;
    }

    public void setBmi() {
        this.bmi = this.weight/Math.pow(this.height / 100, 2);
    }

    public String getNameResult() {
        return nameResult;
    }

    public void setNameResult() {
        if (this.bmi < 16.00){
            this.nameResult = "Wygłodzenie";
        } else if (this.bmi < 16.99){
            this.nameResult = "Wuchudzenie";
        } else if (this.bmi < 18.49){
            this.nameResult = "Niedowaga";
        } else if (this.bmi < 24.99){
            this.nameResult = "Wartość prawidłowa";
        } else if (this.bmi < 29.99){
            this.nameResult = "Nadwaga";
        } else if (this.bmi < 34.99){
            this.nameResult = "Otyłość pierwszego stopnia";
        } else if (this.bmi < 39.99){
            this.nameResult = "Otyłość drugiego stopnia";
        } else{
            this.nameResult = "Otyłość trzeciego stopnia";
        }
    }

    public void setId() {
        this.id = idCounter;
        idCounter++;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        BMI.idCounter = idCounter;
    }
}
