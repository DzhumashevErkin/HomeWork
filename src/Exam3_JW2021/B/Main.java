package Exam3_JW2021.B;

import Exam3_JW2021.C.MyException;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SamePersonInLinkedListException {
        List<Person> personList = new LinkedList<>();
        try {
            addPersonToLinkedList(new Person("Erkin", "Q", "Q"), personList);
            addPersonToLinkedList(new Person("Erkin", "Q", "Q"), personList);
            addPersonToLinkedList(new Person("Erkin", "W", "Q"), personList);
            addPersonToLinkedList(new Person("Erkin", "E", "Q"), personList);
        }catch (SamePersonInLinkedListException ex){
            System.out.println(ex.getMessage());
            throw new SamePersonInLinkedListException("Такой Person уже есть");
        }


    }

    public static void addPersonToLinkedList(Person person, List<Person> personList) throws SamePersonInLinkedListException {
            if (personList.contains(person)) throw new SamePersonInLinkedListException("Такой Person уже есть");
            else personList.add(person);
    }
}
