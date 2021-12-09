package Exam2_JW2021.Library;

import java.util.ArrayList;
import java.util.List;

public class LiteratureDepartment {
    private List<Book> books = new ArrayList<>();
    private String name;

    public void addBook(Book book){
        books.add(book);
    }

    public void outputAllBooks(){
        for (Book book:books) {
            System.out.println(book);
        }
    }

    public void outputLiteratureDepartmentInfo(){
        System.out.println(this);
    }

    public List<Book> searchBookByAuthor(String author){
        List<Book> myBooks = new ArrayList<>();
        for (Book book : books) {
            if(author == book.getAuthor()){
                myBooks.add(book);
            }
        }
        return myBooks;
    }

    public int getCountBooks(){
        return books.size();
    }

    @Override
    public String toString() {
        return "LiteratureDepartment{" +
                "колисество книг=" + books.size() +
                ", название='" + name + '\'' +
                '}';
    }

    public LiteratureDepartment() {
    }

    public LiteratureDepartment(String name) {
        this.name = name;
    }

    public LiteratureDepartment(List<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
