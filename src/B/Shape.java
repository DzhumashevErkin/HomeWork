package B;

public abstract class Shape {
    private char symbol;



    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    abstract void draw();

}
