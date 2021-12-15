package HomeWork30.B;

import HomeWork29.A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //П.1
        ArrayList<Cat> listCat = new ArrayList<>();
        ArrayList<Dog> listDog = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listCat.add(new Cat());
            listDog.add(new Dog());
        }
        listCat.sort(Comparator.comparing(Animal::getAge));
        listDog.sort(Comparator.comparing(Animal::getAge));
        //П.2
        LinkedList<Animal> listAnimal = new LinkedList<>();
        listAnimal.addAll(listCat);
        listAnimal.addAll(listDog);
        //
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i<listAnimal.size();i++) {
            //П.3
            if(listAnimal.get(i) instanceof Cat){
                countCat++;
                if(countCat%5==0) listAnimal.remove(i);
            }
            //П.4
            if(listAnimal.get(i) instanceof Dog){
                countDog++;
                if(countDog%3==0) listAnimal.add(i+1,new Mouse());
            }
        }
        //П.5
        LinkedList<Animal> newListMouseAndCat = new LinkedList<>();
        for (int i = 0; i<listAnimal.size()-1;i++) {
            if(listAnimal.get(i) instanceof Cat && listAnimal.get(i+1) instanceof Mouse ||
               listAnimal.get(i) instanceof Mouse && listAnimal.get(i+1) instanceof Cat)
            {
                newListMouseAndCat.add(listAnimal.get(i));
                newListMouseAndCat.add(listAnimal.get(i+1));
                i++;
            }
        }
        //П.6
        ArrayList<Animal> arrListAnimal = new ArrayList<>(listAnimal);
        //П.7
        int ageCat = 0;
        int ageMouse = 0;
        int ageDog = 0;
        for (Animal an:arrListAnimal) {
            if(an instanceof Cat){
                ageCat+=an.getAge();
            }
            if(an instanceof Dog){
                ageDog+=an.getAge();
            }
            if(an instanceof Mouse){
                ageMouse+=an.getAge();
            }
        }
        //П.8
        LinkedList<Animal> newListAnimal = new LinkedList<>();
        for (Animal an:arrListAnimal) {
            if(an instanceof Cat){
                newListAnimal.add(an);
            }
        }
        for (Animal an:arrListAnimal) {
            if(an instanceof Dog){
                newListAnimal.add(an);
            }
        }
        for (Animal an:arrListAnimal) {
            if(an instanceof Mouse){
                newListAnimal.add(an);
            }
        }
    }
}
