package com.company;

public class Main {

    public static void main(String[] args){

        IdentityCard clientCard = new IdentityCard ();
            clientCard.surname = "Shevhenko";
            clientCard.name = "Taras";
            clientCard.country = "Ukraine";
            clientCard.passportID = "FG223321";
            clientCard.validity = "22/10";

        System.out.println(clientCard);
        clientCard.printInfo();


        RegistrationCard client = new RegistrationCard();
            client.country ="Ukraine";
            client.region = "Kiev";
            client.locality = "Kiev";
            client.street = "Lviv";
            client.number = "2/1";

        System.out.println(client);
        client.printInfo();


        CarCard car = new CarCard();
            car.owner = "Shevhenko";
            car.carnumber = "KE0007BB";
            car.carbrand = "Opel";
            car.carmodel = "Astra";
            car.carpower = 140;
            car.carcolor = "Blue";

        System.out.println(car);
        car.printInfo();



        IdentityCard clientCard2 = new IdentityCard ();
            clientCard2.surname = "Ticina";
            clientCard2.name = "Bogban";
            clientCard2.country = "Ukraine";
            clientCard2.passportID = "FJ513391";
            clientCard2.validity = "29/05";

        System.out.println(clientCard2);
        clientCard2.printInfo();

        RegistrationCard client2 = new RegistrationCard();
            client2.country ="Ukraine";
            client2.region = "Dnipro";
            client2.locality = "Pavlograd";
            client2.street = "Kievska";
            client2.number = "122";

        System.out.println(client);
        client.printInfo();

        CarCard car2 = new CarCard();
            car2.owner = "Ticina";
            car2.carnumber = "AE8000ME";
            car2.carbrand = "BMW";
            car2.carmodel = "730";
            car2.carpower = 370;
            car2.carcolor = "Black";

        System.out.println(car);
        car2.printInfo();

    }
}
