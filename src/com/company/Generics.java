package com.company;

public class Generics {
    public static<T> void printArr(T[] arr){
        for(T element : arr){
            System.out.printf("%s", element);
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> T greatest(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static <T extends Comparable<T>> T greatestInArr(T[] arr){
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
}
