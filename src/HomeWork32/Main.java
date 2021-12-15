package HomeWork32;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Dog> mySet = new HashSet<>();
        Random random = new Random();
        int countError = 1;
        for (int i = 0; i < 40; i++) {
            Dog myDog = new Dog();
            myDog.setBreed("Dalmatian");
            myDog.setName(String.valueOf(random.nextInt(20)));
            myDog.setWeight(random.nextInt(15)+1);
            if(!checkDogInSet(myDog,mySet)) mySet.add(myDog);
            else {
                System.out.println("Ошибка " + countError);
                System.out.println(myDog);
                countError++;
            }
        }
        System.out.println(mySet);
    }

    public static boolean checkDogInSet(Dog dog, Set<Dog> mySet){
        boolean b = false;
        for (Dog dogInSet : mySet) {
            if (dog.equals(dogInSet)) {
                b = true;
                break;
            }
        }
        return b;
    }
}
