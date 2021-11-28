package B;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean isMale;

    Person(){
        System.out.println("Введите ваше имя, возраст, и пол (true - если мужчина и false - если женщина");
        name = getInfo();
        age = Integer.parseInt(getInfo());
        isMale = Boolean.parseBoolean(getInfo());
    }

    private String getInfo() {
        return new Scanner(System.in).next();
    }

    void showInfo() {
        System.out.print(name + " " + age + " " + isMale);
    }


}
