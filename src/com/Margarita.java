package com;

public class Margarita extends Pizza {
    private boolean withMeat;

    @Override
    public String toString() {
        return super.toString() + "Маргарита";
    }

    public Margarita() {
    }

    public Margarita(double price, double weight, boolean withMeat) {
        super(price, weight);
        this.withMeat = withMeat;
    }

    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        this.withMeat = withMeat;
    }
}
