package HomeWork30.B;

import java.util.Random;

public class Animal {
    private int age = new Random().nextInt(100);

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
