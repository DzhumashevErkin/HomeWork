package com.company;

public class Printer implements Runnable{
private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        PrinterRequest.printDocument(name);

    }
}
