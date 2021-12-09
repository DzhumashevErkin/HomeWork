package com.company.task3.product;

import java.time.LocalDate;
import java.util.Arrays;

public class Milk extends Product{
    private LocalDate shelfLife;



    public void isExpiredProduct(){
        if(this.shelfLife.isBefore(LocalDate.now())) System.out.println("Товар просрочен");
        else System.out.println("Товар годен");
    }

    @Override
    public String toString() {
        return "Молоко: " +
                "cрок годности=" + shelfLife +
                ", название='" + name + '\'' +
                ", цена=" + price + '\n' +
                "состав=" + Arrays.toString(compositionOfProducts);
    }

    public Milk() {
    }

    public Milk(String name, double price, CompositionOfProduct[] compositionOfProducts) {
        super(name, price, compositionOfProducts);
    }
    public Milk(String name, double price, CompositionOfProduct[] compositionOfProducts, LocalDate shelfLife) {
        super(name, price, compositionOfProducts);
        this.shelfLife = shelfLife;
    }

    public LocalDate getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(LocalDate shelfLife) {
        this.shelfLife = shelfLife;
    }
}
