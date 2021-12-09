package com.company.task3.product;

import java.time.LocalDate;

public class Product {
    protected String name;
    protected double price;
    protected CompositionOfProduct[] compositionOfProducts;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", compositionOfProducts=" + compositionOfProducts +
                '}';
    }

    public Product() {
    }

    public Product(String name, double price, CompositionOfProduct[] compositionOfProducts) {
        this.name = name;
        this.price = price;
        this.compositionOfProducts = compositionOfProducts;
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

    public CompositionOfProduct[] getCompositionOfProducts() {
        return compositionOfProducts;
    }

    public void setCompositionOfProducts(CompositionOfProduct[] compositionOfProducts) {
        this.compositionOfProducts = compositionOfProducts;
    }
}

