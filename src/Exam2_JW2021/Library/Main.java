package Exam2_JW2021.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Erkin","Kniga1",2000);
        Book book2 = new Book("Erkin","Kniga2",2001);
        Book book3 = new Book("Artur","Kniga3",2001);
        Book book4 = new Book("Emir","Kniga4",2001);
        Book book5 = new Book("Ruslan","Kniga5",2001);

        LiteratureDepartment ld1 = new LiteratureDepartment("Hudojestvennaya");
        ld1.addBook(book1);
        ld1.addBook(book2);
        ld1.addBook(book3);
        ld1.addBook(book4);
        ld1.addBook(book5);

        ld1.outputAllBooks();
        ld1.outputLiteratureDepartmentInfo();
        List<Book> myBook = ld1.searchBookByAuthor("Erkin");
        System.out.println(myBook);
        int countBook = ld1.getCountBooks();
        System.out.println(countBook);
        System.out.println(ld1);
    }

}
