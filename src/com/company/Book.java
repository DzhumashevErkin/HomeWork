package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Book {
    private int id;
    private String author;
    private String name;
    private int yearOfIssue;
    private static BooksWithoutDepartment books;


    public static Book CreateBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте создадим книгу");
        System.out.println("Введите идентификатор книги (целое число)");
        int id = scanner.nextInt();
        System.out.println("Введите имя автора книги");
        String name = scanner.next();
        System.out.println("Введите название книги");
        String studentNumber = scanner.next();
        System.out.println("Введите год выпуска");
        int yearOfAdmission = scanner.nextInt();
        Book book = new Book(id, name, studentNumber, yearOfAdmission);
        BooksWithoutDepartment.addNewBook(book);
        return book;
    }

    public static int selectBook() {
        System.out.println("Выберите книгу:");
        BooksWithoutDepartment.showAllBooks();
        return new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", автор='" + author + '\'' +
                ", название=" + name +
                ", год выпуска=" + yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book group = (Book) o;
        return id == group.id && Objects.equals(name, group.name) && Objects.equals(author, group.author) && Objects.equals(yearOfIssue, group.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, name, yearOfIssue);
    }

    public Book() {
    }

    public Book(int id, String author, String name, int yearOfIssue) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
