package com;

public class Pepperoni extends Pizza {
    private boolean isSpicy;





    @Override
    public String toString() {
        return super.toString() + "Пепперони";
    }

    public Pepperoni() {
    }

    public Pepperoni(double price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
}
