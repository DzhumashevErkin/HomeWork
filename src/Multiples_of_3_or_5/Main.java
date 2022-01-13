package Multiples_of_3_or_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
