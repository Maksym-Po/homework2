package com.company;

public class RegistrationCard {

    String country;
    String region;
    String locality;
    String street;
    String number;

    public void printInfo(){
            System.out.println("Country="+country);
            System.out.println("Region="+region);
            System.out.println("Locality="+locality);
            System.out.println("Street="+street);
            System.out.println("Number="+number);
    }
}