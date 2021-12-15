package com.company.B;

public class Circle {
    private final static Double PI = 3.14;
    private Double radius;

    public Double getSquare(){
        return radius*radius*PI;
    }

    public static Double getLength(Double radius){
        return 2*PI*radius;
    }

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
