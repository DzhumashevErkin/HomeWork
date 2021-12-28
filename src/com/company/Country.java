package com.company;

public class Country {
    private int id;
    private String name;
    private int countryCode;
    private int countryPopulation;
    private String officialLanguage;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", countryPopulation=" + countryPopulation +
                ", officialLanguage='" + officialLanguage + '\'' +
                '}';
    }

    public Country() {
    }

    public Country(int id, String name, int countryCode, int countryPopulation, String officialLanguage) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
        this.officialLanguage = officialLanguage;
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

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }
}
