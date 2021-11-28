package A;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int courseNumber;

    Student() {
        System.out.println("Введите ваше имя, возраст, и номер курса");
        name = getStudentInfo();
        age = Integer.parseInt(getStudentInfo());
        courseNumber = Integer.parseInt(getStudentInfo());
    }

    private String getStudentInfo() {
        return new Scanner(System.in).next();
    }

    void showStudentInfo() {
        System.out.println(name + " " + age + " " + courseNumber);
    }
}
