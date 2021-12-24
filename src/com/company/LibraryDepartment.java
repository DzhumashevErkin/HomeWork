package com.company;

import java.util.Objects;
import java.util.Scanner;

public class LibraryDepartment {
    //класс типо абстрактный
    private Book[] books = new Book[0];



    public void addNewBook(Book newBook){
        Book[] tmpAllBooks = books;
        books = new Book[tmpAllBooks.length + 1];
        System.arraycopy(tmpAllBooks, 0, books, 0, tmpAllBooks.length);
        books[books.length - 1] = newBook;
        BooksWithoutDepartment.deleteBook(newBook);
    }

    public void showAllBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(i+1+". " + books[i]);
        }
    }

    public void searchBookByAuthor(String name){
        for (Book book:this.books) {
            if(Objects.equals(book.getAuthor(), name)){
                System.out.println(book);
            }
        }
    }

    public static int selectDepartment(){
        System.out.println("Выберите отдел библиотеки:");
        System.out.println("1) Художественный");
        System.out.println("2) Юридический");
        System.out.println("3) Технический");
        return new Scanner(System.in).nextInt();
    }

    public void calculateCountBooks(){
        System.out.println("Всего книг в отделе " + books.length);
    }


    public LibraryDepartment() {
    }

    public LibraryDepartment(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

}
