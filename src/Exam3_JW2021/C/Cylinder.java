package Exam3_JW2021.C;

public class Cylinder {
    public String name;

    @Override
    public String toString() {
        return "Цилиндрический предмет: " + name;
    }

    public Cylinder() {
    }

    public Cylinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
