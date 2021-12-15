package com.company.B;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10.0);
        System.out.println(circle.getSquare());
        System.out.println(Circle.getLength(circle.getRadius()));
        // странно, почему 2*3.14*10 = 62.800000000000004 ? ;
    }
}
