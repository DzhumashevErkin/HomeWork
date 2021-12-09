package Exam2_JW2021.B;

public class Pepperoni extends Pizza{
    private boolean isSpicy;





    @Override
    public String toString() {
        return "Pepperoni{" +
                "price="+ getPrice()+
                " weight="+ getWeight()+
                " isSpicy=" + isSpicy +
                '}';
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
