package com.company;

public class Computer {

    private Display display;
    private String brand;
    private String color;
    private SSD ssd;
    private RAM ram;
    private String graphicsCard;
    private USBport usbPort;
    private Keyboard keyboard;

    public Computer() {
    }

    public Computer(Display display, String brand, String color, SSD ssd, RAM ram, String graphicsCard, USBport usbPort, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.usbPort = usbPort;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public USBport getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(USBport usbPort) {
        this.usbPort = usbPort;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
