package A;

public class Employee extends Person {
    private double salary;
    private int experience;

    public Employee() {
    }

    public Employee(String name, int age, double weight, String sex, double salary, int experience) {
        super(name, age, weight, sex);
        this.salary = salary;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", experience='" + experience + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", sex='" + getSex() + '\'' +
                '}';
    }
}
