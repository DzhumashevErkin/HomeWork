package com.company;

public class Display {

    private double dioganal;
    private String manufacturer;
    private String matrixType;

    public Display() {
    }

    public Display(double dioganal, String manufacturer, String matrixType) {
        this.dioganal = dioganal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public double getDioganal() {
        return dioganal;
    }

    public void setDioganal(double dioganal) {
        this.dioganal = dioganal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "dioganal=" + dioganal +
                ", manufacturer='" + manufacturer + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }
}
