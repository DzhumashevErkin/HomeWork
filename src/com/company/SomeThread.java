package com.company;

public class SomeThread extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("1");
        }
    }
}
