package Buying_a_car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));
    }
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        if(startPriceOld>=startPriceNew) return new int[]{0,startPriceOld-startPriceNew};
        double number1 = startPriceOld;
        double number2 = startPriceNew;
        double percent = 1- percentLossByMonth/100;
        int count = 0;
        while(number2>number1+savingperMonth*count){
            number1 = number1*percent;
            number2 = number2*percent;
            if(count%2==0) percent-=0.005;
            count++;
        }
        return new int[]{count,(int)Math.round(number1+savingperMonth*count-number2)};
    }
}
