package com.company;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(20,"Samsung", "TN");
        Keyboard keyboard = new Keyboard(new String[]{"a","b","c"},true,false);
        RAM ram = new RAM("8 Gb","Intel");
        SSD ssd = new SSD("512 Gb",2);
        USBport usbPort = new USBport(3.0,6);
        Computer computer = new Computer(display,"AMD","Black",ssd,ram,"Nvidia 3070Ti",usbPort,keyboard);
        computer.setBrand("IBM");
        computer.setColor("Red");

    }
}
