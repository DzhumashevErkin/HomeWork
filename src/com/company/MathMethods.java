package com.company;

public class MathMethods implements Runnable {
    String name;

    public MathMethods( String name) {
        this.name = name;
    }

    @Override
    public void run() {
        doMath();
    }

    public synchronized void doMath(){
        if (name == "+")  Sum();
        if (name == "-")  Minus();
        if (name == "*")  Umnoj();
        if (name == "/")  Delen();
    }

    public static  void Sum(){
         Main.i+=2;
    }

    public static  void Minus(){
        Main.i-=2;
    }

    public static  void Umnoj(){
        Main.i*=2;
    }

    public static  void Delen(){
        Main.i/=2;
    }
}
