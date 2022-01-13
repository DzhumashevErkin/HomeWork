package sumDigPow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigPow(89,150));
    }
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> myList = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if(checkNumber(i)) myList.add(i);
        }
        return myList;
    }

    public static boolean checkNumber(long number){
        int count = 0;
        long tmp = number;
        long myNumber = number;
        while(tmp>0){
            count++;
            tmp/=10;
        }
        long[] arrNum = new long[count];
        int countArr= 0;
        while(number>0){
            arrNum[countArr] = number % 10;
            number/=10;
            countArr++;
        }
        int sum = 0;
        int c = 1;
        for (int i = arrNum.length-1; i >=0; i--) {
            sum+=Math.pow(arrNum[i],c);
            c++;
        }
        return sum == myNumber;
    }
}
