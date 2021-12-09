package com.company.task3;

import com.company.task3.product.CompositionOfProduct;
import com.company.task3.product.Milk;
import com.company.task3.product.Product;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk();
        milk.setShelfLife(LocalDate.of(2021, Month.DECEMBER,12));
        milk.setName("Веселый молочник");
        milk.setPrice(40.7);
        milk.setCompositionOfProducts(new CompositionOfProduct[]{
                new CompositionOfProduct("Соя"),
                new CompositionOfProduct("Шоколад"),
                new CompositionOfProduct("Кукурма")
        });

        System.out.println(milk);

    }
}
