package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(1,100,LocalDate.of(2022,12,11),3.5);
        System.out.println(Credit.getCountCredit());
        System.out.println(Credit.getSumCredit());
        Credit credit2 = new Credit(2,200,LocalDate.of(2023,11,5),4.5);
        System.out.println(Credit.getCountCredit());
        System.out.println(Credit.getSumCredit());
        Credit credit3 = new Credit();
        credit3.setId(3);
        credit3.setSum(350);
        credit3.setPeriod(LocalDate.of(2025,11,11));
        credit3.setInterestRate(6.5);
        System.out.println(Credit.getCountCredit());
        System.out.println(Credit.getSumCredit());
        Credit credit4 = new Credit(1,100,LocalDate.of(2022,12,11),3.5);
        System.out.println(Credit.getCountCredit());
        System.out.println(Credit.getSumCredit());
        Credit credit5 = new Credit(1,100,LocalDate.of(2022,12,11),3.5);
        System.out.println(Credit.getCountCredit());
        System.out.println(Credit.getSumCredit());
        System.out.println(Credit.getAvgSumCredit());
    }
}
