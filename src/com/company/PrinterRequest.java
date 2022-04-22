package com.company;

public class PrinterRequest {
    public synchronized static void printDocument(String name) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Printer " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
