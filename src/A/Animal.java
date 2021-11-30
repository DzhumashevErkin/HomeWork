package A;

public class Animal {
    private String name;
    private String breed;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getAge() {
        return age;
    }

}
