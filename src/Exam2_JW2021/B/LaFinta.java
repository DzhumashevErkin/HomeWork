package Exam2_JW2021.B;

public class LaFinta extends Pizza{
    private boolean withMushrooms;

    @Override
    public String toString() {
        return "LaFinta{" +
                "price="+ getPrice()+
                " weight="+ getWeight()+
                " withMushrooms=" + withMushrooms +
                '}';
    }

    public LaFinta() {
    }

    public LaFinta(double price, double weight, boolean withMushrooms) {
        super(price, weight);
        this.withMushrooms = withMushrooms;
    }

    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        this.withMushrooms = withMushrooms;
    }
}
