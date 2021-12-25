package com;

public class Margarita extends Pizza {
    private boolean hasMeat;

    @Override
    public String toString() {
        return super.toString() + "Маргарита";
    }

    public Margarita() {
    }

    public Margarita(double price, double weight, boolean withMeat) {
        super(price, weight);
        this.hasMeat = withMeat;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }
}
