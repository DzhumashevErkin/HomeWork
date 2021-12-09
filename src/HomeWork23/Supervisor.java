package HomeWork23;

import java.util.Objects;

public class Supervisor {
    private String name;
    private int age;
    private Locality locality;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supervisor that = (Supervisor) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(locality, that.locality) && Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, locality, sex);
    }

    public Supervisor() {
    }

    public Supervisor(String name, int age, Locality locality, String sex) {
        this.name = name;
        this.age = age;
        this.locality = locality;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
