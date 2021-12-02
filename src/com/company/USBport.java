package com.company;

public class USBport {

    private double portType = 2.0;
    private int id;

    public USBport() {
    }

    public USBport(double portType, int id) {
        this.portType = portType;
        this.id = id;
    }

    public double getPortType() {
        return portType;
    }

    public void setPortType(double portType) {
        this.portType = portType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
