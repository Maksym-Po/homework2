package com.company;

public class IdentityCard {

    String surname;
    String name;
    String country;
    String passportID;
    String validity;

    public void printInfo() {
        System.out.println("Surname="+surname);
        System.out.println("Name="+name);
        System.out.println("Country="+country);
        System.out.println("PassportID="+passportID);
        System.out.println("Validity="+validity);
    }
}