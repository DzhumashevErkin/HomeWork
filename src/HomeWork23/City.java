package HomeWork23;

public class City extends Locality{
    private District[] districts;

    public City() {
    }

    public City(String name, int population, Supervisor supervisor, District[] districts) {
        super(name, population, supervisor);
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }
}
