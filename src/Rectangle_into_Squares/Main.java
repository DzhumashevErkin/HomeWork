package Rectangle_into_Squares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqInRect(3,5));
    }
    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> myArr = new ArrayList<>();
        if(lng==wdth) return null;
        else{
            boolean check = true;
            while(check){
                int minNumber = Math.min(lng,wdth);
                int maxNumber = Math.max(lng,wdth);
                myArr.add(minNumber);
                lng = minNumber;
                wdth = maxNumber - minNumber;
                if(lng==wdth){
                    myArr.add(lng);
                    check=false;
                }
            }
            return myArr;
        }
    }
}
