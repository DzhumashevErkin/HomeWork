package com;

public class Main {
    public static void main(String[] args) {
        Margarita margarita = new Margarita(15.3,401.3,true);
        Pepperoni pepperoni = new Pepperoni(20.2,508.9,false);
        LaFinta laFinta = new LaFinta(30.8,603.4,true);

        System.out.println(margarita);
        System.out.println(pepperoni);
        System.out.println(laFinta);

        margarita.cookPizza();
        pepperoni.cookPizza();
        laFinta.cookPizza();

        margarita.pizzaDelivery();
        pepperoni.pizzaDelivery();
        laFinta.pizzaDelivery();
    }
}
