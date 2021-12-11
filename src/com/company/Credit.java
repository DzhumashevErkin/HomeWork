package com.company;

import java.time.LocalDate;

public class Credit {
    private int id;
    private double sum;
    private LocalDate period;
    private double interestRate;
    private static int countCredit;
    private static double sumCredit;

    public static double getAvgSumCredit() {
        return sumCredit / countCredit;
    }

    {
        countCredit++;
    }

    public Credit() {
    }

    public Credit(int id, double sum, LocalDate period, double interestRate) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
        sumCredit += this.sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        sumCredit -= this.sum;
        this.sum = sum;
        sumCredit += this.sum;
    }

    public LocalDate getPeriod() {
        return period;
    }

    public void setPeriod(LocalDate period) {
        this.period = period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static int getCountCredit() {
        return countCredit;
    }

    public static void setCountCredit(int countCredit) {
        Credit.countCredit = countCredit;
    }

    public static double getSumCredit() {
        return sumCredit;
    }

    public static void setSumCredit(double sumCredit) {
        Credit.sumCredit = sumCredit;
    }

}
