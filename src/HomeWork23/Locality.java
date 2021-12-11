package HomeWork23;

public abstract class Locality {
    private String name;
    private int population;
    private Supervisor supervisor;

    @Override
    public String toString() {
        return "Locality{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", supervisor=" + supervisor +
                '}';
    }

    public Supervisor isYourSupervisor(Supervisor supervisor){
        if (this.supervisor.equals(supervisor)) return supervisor;
        else return null;
    }

    public Locality() {
    }

    public Locality(String name, int population, Supervisor supervisor) {
        this.name = name;
        this.population = population;
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
}
