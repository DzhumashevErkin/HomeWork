package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(50);
        set.add(1);
        set.add(2);
        System.out.println(set);
    }
}
