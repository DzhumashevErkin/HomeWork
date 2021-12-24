package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 1; i < circles.length + 1; i++) {
            circles[i - 1] = new Circle(i);
        }
        int countCirclesMultipleOfThree = 0;
        for (Circle circle : circles) {
            if (circle.calculateSquare() % 3 == 0) {
                countCirclesMultipleOfThree++;
            }
            System.out.println(circle.calculateSquare());
        }
        System.out.println(countCirclesMultipleOfThree);

    }
}
