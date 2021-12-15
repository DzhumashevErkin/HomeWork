package HomeWork30.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> list1 = new ArrayList<>();
        LinkedList<Cat> list2 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list1.add(new Cat());
            list2.add(new Cat());
        }
        System.out.println("Вставка в середину");
        addL(list1);
        addL(list2);
        System.out.println("Вставка в начало");
        addToStart(list1);
        addToStart(list2);
        System.out.println("Вставка в конец");
        addToEnd(list1);
        addToEnd(list2);
        System.out.println("Получить середину");
        getFromMiddle(list1);
        getFromMiddle(list2);
        System.out.println("Получить конец");
        getFromEnd(list1);
        getFromEnd(list2);
        System.out.println("Удалить начало");
        removeStart(list1);
        removeStart(list2);
        System.out.println("Удалить середину");
        removeMiddle(list1);
        removeMiddle(list2);



    }

    public static void addL(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.add(myList.size()/2,new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void addL(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.add(myList.size()/2,new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }

    public static void addToStart(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.add(0,new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void addToStart(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.addFirst(new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void addToEnd(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.add(myList.size(), new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void addToEnd(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.addLast(new Cat());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }

    public static void getFromMiddle(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.get(myList.size()/2);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }

    public static void getFromMiddle(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.get(myList.size()/2);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }

    public static void getFromEnd(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.get(myList.size()-1);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void getFromEnd(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.getLast();
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }

    public static void removeStart(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.remove(0);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void removeStart(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.removeFirst();
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void removeMiddle(ArrayList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.remove(myList.size()/2);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
    public static void removeMiddle(LinkedList<Cat> myList){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            myList.remove(myList.size()/2);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
    }
}
