package ClassWork53;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        for(int i = 1; i<=1000;i++){
            int n = random.nextInt(101);
            int prevCount = myHashMap.getOrDefault(n,0);
            myHashMap.put(n,++prevCount);

        }
        System.out.println(myHashMap);


    }
}
