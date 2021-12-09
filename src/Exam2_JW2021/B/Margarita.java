package Exam2_JW2021.B;

public class Margarita extends Pizza{
    private boolean withMeat;

    @Override
    public String toString() {
        return "Margarita{" +
                "price="+ getPrice()+
                " weight="+ getWeight()+
                " withMeat=" + withMeat +
                '}';
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
