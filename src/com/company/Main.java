package com.company;

public class Main {

    public static void main(String[] args) {
        Minibus minibus = new Minibus();
        minibus.setNumberOfSeats(5);
        minibus.addPassenger(new Passenger(15,"Person1",1));
        minibus.addPassenger(new Passenger(16,"Person2",4));
        minibus.addPassenger(new Passenger(17,"Person3",3));
        minibus.addPassenger(new Passenger(18,"Person4",5));
        minibus.addPassenger(new Passenger(19,"Person5",2));
        minibus.displayPassengers();
        minibus.flightSalary();
        minibus.addPassenger(new Passenger(19,"Person5",5));
        minibus.searchPassengerByName("Person4");
        minibus.sortMinibus();
        minibus.displayPassengers();
    }
}
