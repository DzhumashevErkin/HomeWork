package HomeWork31;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        byte[] arrMass = new byte[10];
        ArrayList<Byte> arrList= new ArrayList<>();
        LinkedList<Byte> arrLinked = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrMass[i] = (byte)random.nextInt(2);
            arrList.add((byte)random.nextInt(2));
            arrLinked.add((byte)random.nextInt(2));
        }
        arrMass = sortArr(arrMass);
        arrList = sortArr(arrList);
        arrLinked = sortArr(arrLinked);
        System.out.println(Arrays.toString(arrMass));
        System.out.println(arrList);
        System.out.println(arrLinked);

    }

    public static byte[] sortArr(byte[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static ArrayList<Byte> sortArr(ArrayList<Byte> arr){
        Collections.sort(arr);
        return arr;
    }
    public static LinkedList<Byte> sortArr(LinkedList<Byte> arr){
        Collections.sort(arr);
        return arr;
    }
}
