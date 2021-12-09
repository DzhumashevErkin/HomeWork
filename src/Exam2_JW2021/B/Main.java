package Exam2_JW2021.B;

public class Main {
    public static void main(String[] args) {
        Margarita margarita = new Margarita(15,400,true);
        Pepperoni pepperoni = new Pepperoni(20,500,false);
        LaFinta laFinta = new LaFinta(30,600,true);

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
