package HomeWork32;

import java.util.Objects;

public class Dog {
    private String breed;
    private String name;
    private Integer weight;



    @Override
    public String toString() {
        return  "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) && Objects.equals(name, dog.name) && Objects.equals(weight, dog.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, weight);
    }

    public Dog() {
    }

    public Dog(String breed, String name, Integer weight) {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
