package A;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Erkin", 23, 73, "Male");
        Employee employee = new Employee("Natasha", 22, 60, "Female", 2500, 3);
        Driver driver = new Driver("Baktybek", 30, 80, "Male", 25000, 10, "Honda Odyssey", "Yandex Taxi");
        System.out.println(person);
        System.out.println(employee);
        System.out.println(driver);

    }
}
