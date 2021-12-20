package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Student student1 = new Student("Erkin",23);
//        Student student2 = new Student("Emir",25);
//        Student student3 = new Student("Erlan",24);
//
//        Group group = new Group(new Student[3],1,"ЕПМ1-15");
//        group.addStudent(student1);
//        group.addStudent(student2);
//        group.addStudent(student3);
//        group.addStudent(student1);
//        Group group2 = new Group(new Student[3],1,"ЕПМ2-22");
//        group2.addStudent(student1);
//        group2.addStudent(student1);
//        group2.addStudent(student3);
//        Group.searchGroupByNameAndShowStudents("ЕПМ2-22");
//        Group.showAllGroups();
        Menu();
    }

    public static void Menu() {
        System.out.println();
        System.out.println("Выберите действие:");
        System.out.println("1:Создать ученика");
        System.out.println("2:Создать группу");
        System.out.println("3:Добавить ученика в группу");
        System.out.println("4:Поиск группы по названию");
        System.out.println("5:Просмотр всех групп и их учеников");
        System.out.println("6:Выход");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":
                System.out.println("Введите имя студента");
                String nameStudent = scanner.next();
                System.out.println("Введите возраст ученика");
                Integer age = scanner.nextInt();
                Student student = new Student(nameStudent, age);
                System.out.println("ученик " + student + " создан");
                Menu();
                break;
            case "2":
                System.out.println("Введите номер группы");
                Integer numberGroup = scanner.nextInt();
                System.out.println("Введите название группы");
                String nameGroup = scanner.next();
                System.out.println("Введите максимальное количество студентов в группе");
                int numberStudentsInGroup = scanner.nextInt();
                Group group = new Group(new Student[numberStudentsInGroup], numberGroup, nameGroup);
                Menu();
                break;
            case "3":
                System.out.println("Выберите ученика");
                if (Student.getStudents().size() == 0) {
                    System.out.println("Студентов еще нет");
                    Menu();
                } else System.out.println(Student.getStudents());
                int numberStudent = scanner.nextInt();
                Student studentToGroup = Student.getStudents().get(numberStudent - 1);
                System.out.println("Вы выбрали " + studentToGroup);
                System.out.println("Теперь выберите группу в которую вы хотите добавить студента");
                Group.showAllGroups();
                int numberGroupToAddStudent = scanner.nextInt();
                Group.getAllGroups()[numberGroupToAddStudent - 1].addStudent(studentToGroup);
                Menu();
                break;
            case "4":
                System.out.println("Введите название группы, которую хотите найти");
                String groupNameForSearch = scanner.next();
                Group.searchGroupByNameAndShowStudents(groupNameForSearch);
                Menu();
                break;
            case "5":
                Group.showAllGroups();
                Menu();
                break;
            case "6":
                break;
            default:
                Menu();
                break;

        }
    }
}
