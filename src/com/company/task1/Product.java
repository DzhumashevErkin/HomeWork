package com.company.task1;

import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    private LocalDate shelfLife;

    public void isExpiredProduct(){
        if(this.shelfLife.isBefore(LocalDate.now())) System.out.println("Товар просрочен");
        else System.out.println("Товар годен");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                '}';
    }

    public Product(double price, LocalDate shelfLife) {
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public Product(String name, double price, LocalDate shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(LocalDate shelfLife) {
        this.shelfLife = shelfLife;
    }
}
