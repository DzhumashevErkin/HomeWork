package com.company;

public class RAM {

    private String capacity;
    private String manufacturer;

    public RAM() {
    }

    public RAM(String capacity, String manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity='" + capacity + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
