package Exam3_JW2021.C;

public class Flat {
    private String name;

    @Override
    public String toString() {
        return "Плоский предмет: " + name;
    }

    public Flat() {
    }

    public Flat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
