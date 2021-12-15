package HomeWork29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class B {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            myList.add(random.nextInt(100)+1);
        }
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (Integer i:myList) {
            if(i%2==0) evenList.add(i);
            else oddList.add(i);
        }
        System.out.println(oddList);
        System.out.println(evenList);
    }
}
