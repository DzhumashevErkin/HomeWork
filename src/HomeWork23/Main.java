package HomeWork23;

public class Main {
    public static void main(String[] args) {
        City city1 = new City();
        Supervisor supervisor1 = new Supervisor();
        supervisor1.setAge(50);
        supervisor1.setLocality(city1);
        supervisor1.setName("Мэр1");
        supervisor1.setSex("Male");
        city1.setName("Bishkek");
        city1.setPopulation(1000000);
        city1.setSupervisor(supervisor1);

    }
}
