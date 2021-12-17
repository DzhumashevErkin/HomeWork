package Exam3_JW2021.C;

import HomeWork29.B;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException {
        createFirstBackpack();
        createSecondBackpack();
        createThirdBackpack();
    }

    public static void createFirstBackpack(){
        try {
            Backpack backpack1 = new Backpack();
            backpack1.addAccesory(new Cylinder("Koka-kola"));
            backpack1.addAccesory(new Flat("book"));
            for (int i = 0; i < 20; i++) {
                backpack1.addAccesory(new Round("apple " + (i+1)));
            }
            System.out.println(backpack1);
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void createSecondBackpack(){
        try {
            Backpack backpack2 = new Backpack();
            backpack2.addAccesory(new Cylinder("bottle of water"));
            backpack2.addAccesory(new Flat("folder"));
            for (int i = 0; i < 50; i++) {
                backpack2.addAccesory(new Round("tennis ball " + (i+1)));
            }
            System.out.println(backpack2);
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void createThirdBackpack(){
        try {
            Backpack backpack3 = new Backpack();
            backpack3.addAccesory(new Cylinder("koka-kola"));
            backpack3.addAccesory(new Flat("folder"));
            for (int i = 0; i < 10; i++) {
                backpack3.addAccesory(new Round("apple " + (i+1)));
            }
            for (int i = 0; i < 3; i++) {
                backpack3.addAccesory(new Round("tennis ball " + (i+1)));
            }
            System.out.println(backpack3);
            System.out.println();
            backpack3.addAccesory(new Cylinder("koka-kola2"));
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }


}
