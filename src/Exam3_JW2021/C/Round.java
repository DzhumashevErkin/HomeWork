package Exam3_JW2021.C;

public class Round {
    private String name;

    @Override
    public String toString() {
        return "Круглый предмет: " + name;
    }

    public Round() {
    }

    public Round(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
