package com.company;

public class BooksWithoutDepartment {
    private static Book[] books = new Book[0];

    public static void addNewBook(Book newBook) {
        Book[] tmpAllBooks = books;
        books = new Book[tmpAllBooks.length + 1];
        System.arraycopy(tmpAllBooks, 0, books, 0, tmpAllBooks.length);
        books[books.length - 1] = newBook;
    }

    public static void showAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + 1 + ". " + books[i]);
        }
    }

    public static void deleteBook(Book book) {
        Book[] tmpAllBooks = books;
        books = new Book[tmpAllBooks.length - 1];
        int count = 0;
        for (Book tmpAllBook : tmpAllBooks) {
            if (tmpAllBook != null && tmpAllBook.equals(book)) {
                continue;
            }
            books[count] = tmpAllBook;
            count++;
        }
    }

    public static Book[] getBooks() {
        return books;
    }
}
