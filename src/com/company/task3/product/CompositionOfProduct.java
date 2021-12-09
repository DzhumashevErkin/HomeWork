package com.company.task3.product;

public class CompositionOfProduct {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public CompositionOfProduct() {
    }

    public CompositionOfProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
