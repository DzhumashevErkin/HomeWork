package Perimeter_of_squares_in_a_rectangle;

import java.math.BigInteger;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
        System.out.println(perimeter(BigInteger.valueOf(7)));
        System.out.println(perimeter(BigInteger.valueOf(30)));
    }
    public static BigInteger perimeter(BigInteger n) {
        BigInteger tmp = BigInteger.ZERO;
        BigInteger number1 = BigInteger.ONE;
        BigInteger number2 = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            tmp = number1;
            number1 = number2;
            number2 = tmp.add(number1);
            sum = sum.add(tmp);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}
