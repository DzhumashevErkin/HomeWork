package B;

import java.util.Scanner;

public class Employee extends Person {
    private String profession;
    private double salary;

    Employee(){
        System.out.println("Введите вашу профессию и заработную плату");
        profession = getInfo();
        salary = Double.parseDouble(getInfo());
    }

    private String getInfo() {
        return new Scanner(System.in).next();
    }

    void showInfo() {
        super.showInfo();
        System.out.println( " " + profession + " " + salary);
    }
}
