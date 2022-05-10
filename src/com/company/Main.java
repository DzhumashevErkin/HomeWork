package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.printf("Крупнейшее из %d, %d и %d это %d", 3, 4, 5, greatest(3, 4, 5));
//        System.out.printf("\n\nКрупнейшее из %.1f, %.1f и %.1f это %.1f", 3.3, 3.3, 5.5, greatest(3.3, 4.4, 5.5));
//        System.out.printf("\n\nКрупнейшее из %s, %s и %s это %s", "шапка", "куртка", "туфли", greatest("шапка", "куртка", "туфли"));
//        System.out.println();

        Integer[] intArr = {7,13,8,9,10,22};
        String[] strArr = {"First","Second","Third","Kesha"};
        System.out.println(Generics.greatestInArr(intArr));
        System.out.println(Generics.greatestInArr(strArr));
    }
}
