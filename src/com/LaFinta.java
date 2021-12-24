package com;

public class LaFinta extends Pizza {
    private boolean hasMushrooms;

    @Override
    public String toString() {
        return super.toString() + "Ла Финта";
    }

    public LaFinta() {
    }

    public LaFinta(double price, double weight, boolean withMushrooms) {
        super(price, weight);
        this.hasMushrooms = withMushrooms;
    }

    public boolean isHasMushrooms() {
        return hasMushrooms;
    }

    public void setHasMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
    }
}
