package Pascals_Triangle;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Fact(BigInteger.valueOf(5)));
        System.out.println(Arrays.toString(generate(4)));

    }
    public static long[] generate(int level) {
        long[][] arr = new long[level][];
        int lengthArr = 0;
        for (int i = 0; i < level; i++) {
            int length = i+1;
            arr[i] = new long[length];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (Fact(BigInteger.valueOf(i)).divide(Fact(BigInteger.valueOf(j)).multiply(Fact(BigInteger.valueOf(i-j))))).longValue();
                lengthArr++;
            }
        }
        long[] newArr = new long[lengthArr];
        int count = 0;
        for (long[] arr1:arr) {
            for (long l:arr1) {
                newArr[count] = l;
                count++;
            }
        }
        return newArr;

    }

    public static BigInteger Fact(BigInteger n){
        if(n.compareTo(BigInteger.valueOf(1))<=0) return BigInteger.ONE;
        else return n.multiply(Fact(n.subtract(BigInteger.valueOf(1))));
    }
}
