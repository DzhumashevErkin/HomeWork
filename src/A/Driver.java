package A;

public class Driver extends Employee {
    private String carName;
    private String companyName;

    public Driver() {
    }


    public Driver(String name, int age, double weight, String sex, double salary, int experience, String carName, String companyName) {
        super(name, age, weight, sex, salary, experience);
        this.carName = carName;
        this.companyName = companyName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "carName='" + carName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + getSalary() +
                ", experience='" + getExperience() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", sex='" + getSex() + '\'' +
                '}';
    }
}
