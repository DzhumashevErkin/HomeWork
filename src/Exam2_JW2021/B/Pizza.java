package Exam2_JW2021.B;

public class Pizza {
    private double price;
    private double weight;
    private static int numberCookedPizza;


    public void cookPizza(){
        numberCookedPizza++;
        System.out.println("Готовится пицца №" + numberCookedPizza);
    }

    public void pizzaDelivery(){
        System.out.println(this);
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

    public static void setNumberCookedPizza(int numberCookedPizza) {
        Pizza.numberCookedPizza = numberCookedPizza;
    }


}
