package Exam3_JW2021.A;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInteger = createIntegerArrayFromOneToOneHundred();
        HashSet<Integer> setInteger = createEvenIntegerHashSetFromOneToOneHundred();
        System.out.println();
        System.out.println(setInteger);
    }

    public static Integer[] createIntegerArrayFromOneToOneHundred() {
        Integer[] arrInt = new Integer[100];
        for (int i = 1; i <= 100; i++) {
            arrInt[i - 1] = i;
        }
        return arrInt;
    }

    public static HashSet<Integer> createEvenIntegerHashSetFromOneToOneHundred() {
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                set.add(i);
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                set.add(i);
            }
        }
        return set;
    }

}
