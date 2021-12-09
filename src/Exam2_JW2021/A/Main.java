package Exam2_JW2021.A;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
            circles[i].setRadius(i);
        }
        int countCirclesMultipleOfThree = 0;
        for (Circle circle: circles) {
            if(circle.calculateSquare()%3==0){
                countCirclesMultipleOfThree++;
            }
            System.out.println(circle.calculateSquare());
        }
        System.out.println(countCirclesMultipleOfThree);

    }
}
