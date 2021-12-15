package com.company;

public class Passenger {
    private Integer fare;
    private String name;
    private Integer number;

    @Override
    public String toString() {
        return "Passenger{" +
                "fare=" + fare +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public Passenger() {
    }

    public Passenger(Integer fare, String name, Integer number) {
        this.fare = fare;
        this.name = name;
        this.number = number;
    }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
