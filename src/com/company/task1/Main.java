package com.company.task1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Молоко",50.5, LocalDate.of(2021, Month.DECEMBER,11));
        Product product2 = new Product("Молоко",50.5, LocalDate.of(2021, Month.DECEMBER,8));
        System.out.println(product1);
        product1.isExpiredProduct();
        product2.isExpiredProduct();
    }
}
