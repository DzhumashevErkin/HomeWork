package Exam2_JW2021.Library;

public class Book {
    private static int id;
    private String author;
    private String name;
    private int yearPublished;

    static {
        id++;
    }

    public Book() {
    }

    public Book(String author, String name, int yearPublished) {
        this.author = author;
        this.name = name;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }

    public int getId() {
        return id;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
