package com.company.task2;

import com.company.task2.product.Milk;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(); // Public access modifier, виден везде
//        Tea tea = new Tea(); // Default access modifier, класс Tea может быть виден только в пакете product
    }
}
