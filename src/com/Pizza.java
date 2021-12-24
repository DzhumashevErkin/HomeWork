package com;

public class Pizza {
    private double price;
    private double weight;
    private static int numberCookedPizza;


    public void cookPizza(){
        numberCookedPizza++;
        System.out.println("Готовится пицца №" + numberCookedPizza);
    }



    public void pizzaDelivery(){
        System.out.println("Ваша пицца в пути");
        System.out.print("Информация о вашей пицце(напоминаем) ");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Пицца " +
                "стоит " + price + "$, " +
                "весит " + weight + " грамм, " +
                "тип: "; // Т.к. пицца абстрактный класс(но мы его не проходили), то метод toString будут
                            // реализовывать только его потомки. Поэтому тут могу написать "тип: ".
    }

    public Pizza() {
    }

    public Pizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getNumberCookedPizza() {
        return numberCookedPizza;
    }



}
