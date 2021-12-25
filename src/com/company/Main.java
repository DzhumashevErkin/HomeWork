package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryDepartment artLibraryDepartment = new ArtLibraryDepartment();
        LibraryDepartment lawLibraryDepartment = new LawLibraryDepartment();
        LibraryDepartment technicalLibraryDepartment = new TechnicalLibraryDepartment(true);
        Scanner scanner = new Scanner(System.in);
        int point;
        int pointDepartment;
        int pointBook;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать книгу");
            System.out.println("2. Добавить книгу в отдел");
            System.out.println("3. Вывести все книги отдела");
            System.out.println("4. Вывести всю информацию отдела");
            System.out.println("5. Поиск книги по автору в отделе");
            System.out.println("6. Посчитать сколько книг в отделе");
            System.out.println("7. Выход");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Book book = Book.CreateBook();
                    break;
                case 2:
                    if (BooksWithoutDepartment.getBooks().length == 0) {
                        System.out.println("Книг без отдела еще нет");
                        Book firstBook = Book.CreateBook();
                    } else {
                        pointDepartment = LibraryDepartment.selectDepartment();
                        pointBook = Book.selectBook();
                        switch (pointDepartment) {
                            case 1 -> artLibraryDepartment.addNewBook(BooksWithoutDepartment.getBooks()[pointBook - 1]);
                            case 2 -> lawLibraryDepartment.addNewBook(BooksWithoutDepartment.getBooks()[pointBook - 1]);
                            case 3 -> technicalLibraryDepartment.addNewBook(BooksWithoutDepartment.getBooks()[pointBook - 1]);
                            default -> {
                            }
                        }
                    }
                    break;
                case 3:
                    pointDepartment = LibraryDepartment.selectDepartment();
                    switch (pointDepartment) {
                        case 1 -> artLibraryDepartment.showAllBooks();
                        case 2 -> lawLibraryDepartment.showAllBooks();
                        case 3 -> technicalLibraryDepartment.showAllBooks();
                        default -> {
                        }
                    }
                    break;
                case 4:
                    pointDepartment = LibraryDepartment.selectDepartment();
                    switch (pointDepartment) {
                        case 1 -> System.out.println(artLibraryDepartment);
                        case 2 -> System.out.println(lawLibraryDepartment);
                        case 3 -> System.out.println(technicalLibraryDepartment);
                        default -> {
                        }
                    }
                    break;
                case 5:
                    System.out.println("Введите автора книги");
                    String nameBook = scanner.next();
                    System.out.println();
                    pointDepartment = LibraryDepartment.selectDepartment();
                    switch (pointDepartment) {
                        case 1 -> artLibraryDepartment.searchBookByAuthor(nameBook);
                        case 2 -> lawLibraryDepartment.searchBookByAuthor(nameBook);
                        case 3 -> technicalLibraryDepartment.searchBookByAuthor(nameBook);
                        default -> {
                        }
                    }
                    break;
                case 6:
                    pointDepartment = LibraryDepartment.selectDepartment();
                    switch (pointDepartment) {
                        case 1 -> artLibraryDepartment.calculateCountBooks();
                        case 2 -> lawLibraryDepartment.calculateCountBooks();
                        case 3 -> technicalLibraryDepartment.calculateCountBooks();
                        default -> {
                        }
                    }
                    break;
            }
        } while (point != 7);
    }
}
