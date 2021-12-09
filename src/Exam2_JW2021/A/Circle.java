package Exam2_JW2021.A;

public class Circle {
    private double radius;
    private final static double PI = 3.14;

    public double calculateSquare(){
        return radius*radius*PI;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
