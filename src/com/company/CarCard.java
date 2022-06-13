package com.company;

public class CarCard {

    String owner;
    String carnumber;
    String carbrand;
    String carmodel;
    int carpower ;
    String carcolor;

    public void printInfo() {
        System.out.println("Owner="+owner);
        System.out.println("Number="+carnumber);
        System.out.println("Brand="+carbrand);
        System.out.println("Model="+carmodel);
        System.out.println("Power="+carpower);
        System.out.println("Color="+carcolor);
    }
}

