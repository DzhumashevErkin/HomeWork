package com.company;

public class Main {

    static volatile int i = 10;
    public static void main(String[] args) {
//        SomeThread someThread = new SomeThread();
//        someThread.start();
//
//        Thread secondThread = new Thread(new SecondThread());
//        secondThread.start();
//        while (true){
//            System.out.println("2");
//        }
//
//        Thread printerErkin = new Thread(new Printer("Erkin"));
//        Thread printerRuslan = new Thread(new Printer("Ruslan"));
//        Thread printerEmir = new Thread(new Printer("Emir"));
//
//        printerEmir.start();
//        printerErkin.start();
//        printerRuslan.start();

        for (int i1 = 0; i1 < 100; i1++) {
            i = 10;
            Thread thread1 = new Thread(new MathMethods("+"));
            Thread thread2 = new Thread(new MathMethods("-"));
            Thread thread3 = new Thread(new MathMethods("*"));
            Thread thread4 = new Thread(new MathMethods("/"));

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();

            System.out.println(i);

            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();
            thread4.interrupt();
        }


    }
}
