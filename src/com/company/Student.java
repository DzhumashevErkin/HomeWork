package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private Integer age;
    private static List<Student> students = new ArrayList<>() {

        @Override
        public String toString() {
            String result = "";
            for (int i = 0; i < students.size(); i++) {
                result += i + 1 + ") " + students.get(i);
            }
            return result;
        }

    };


    @Override
    public String toString() {
        return "name='" + name +
                "', age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student() {
        students.add(this);
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        students.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static List<Student> getStudents() {
        return students;
    }

}
