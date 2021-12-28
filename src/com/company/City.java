package com.company;

public class City {
    private int id;
    private String name;
    private Country country;

    private int cityPopulation;

    public City() {
    }

    public City(int id, String name, Country country, int cityPopulation) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", cityPopulation=" + cityPopulation +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
