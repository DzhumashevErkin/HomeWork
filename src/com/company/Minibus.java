package com.company;

import java.util.ArrayList;
import java.util.List;

public class Minibus {
    private Integer numberOfSeats;
    private List<Passenger> passengers = new ArrayList<>();

    public void displayPassengers(){
        for (Passenger passenger:passengers) {
            System.out.println(passenger);
        }
    }

    public void addPassenger(Passenger passenger){
        if(passengers.size()<numberOfSeats) passengers.add(passenger);
        else System.out.println("В маршрутке нет мест");
    }

    public void searchPassengerByName(String name){
        for (Passenger passenger:passengers) {
            if(passenger.getName().equals(name)){
                System.out.println(passenger);
                return;
            }
        }
        System.out.println("Пассажир не найден");
    }

    public void flightSalary(){
        int sum = 0;
        for (Passenger passenger:passengers) {
            sum+=passenger.getFare();
        }
        System.out.println("За рейс заработано " + sum);
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "numberOfSeats=" + numberOfSeats +
                ", passengers=" + passengers +
                '}';
    }

    public Minibus() {
    }

    public Minibus(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Minibus(Integer numberOfSeats, List<Passenger> passengers) {
        this.numberOfSeats = numberOfSeats;
        this.passengers = passengers;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}
