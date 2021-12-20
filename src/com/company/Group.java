package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Group {
    private Integer id;
    private String name;
    private Student[] students;
    private static Integer numberOfGroups = 0;
    private static Group[] allGroups = new Group[0];

    public void addStudent(Student student) {
        boolean checkFreePlace = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                checkFreePlace = false;
                break;
            }
        }
        if (checkFreePlace) System.out.println("В группе нет мест");
    }

    private void addGroup() {
        Group[] tmpAllGroups = allGroups;
        allGroups = new Group[tmpAllGroups.length + 1];
        System.arraycopy(tmpAllGroups, 0, allGroups, 0, tmpAllGroups.length);
        allGroups[allGroups.length - 1] = this;
    }

    public static void searchGroupByNameAndShowStudents(String groupName) {
        for (Group group : allGroups) {
            if (Objects.equals(group.getName(), groupName)) {
                boolean check = true;
                for (Student student : group.getStudents()) {
                    if (student != null) {
                        System.out.print(student + "  ");
                        check = false;
                    }
                }
                if (check) System.out.println("Такая группа есть,но в группе студентов еще нет");
            }
        }
    }

    public static void showAllGroups() {
        for (int i = 0; i < allGroups.length; i++) {
            System.out.println(i + 1 + ") " + allGroups[i]);
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            result += "     " + (i + 1) + ". " + students[i];
        }
        return "id=" + id +
                ", name='" + name +
                "'\n   students:\n" + result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Arrays.equals(students, group.students) && Objects.equals(id, group.id) && Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }


    public Group(Student[] students, Integer id, String name) {
        this.students = students;
        this.id = id;
        this.name = name;
        numberOfGroups++;
        addGroup();
    }

    public Student[] getStudents() {
        return students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    public static Group[] getAllGroups() {
        return allGroups;
    }

}
