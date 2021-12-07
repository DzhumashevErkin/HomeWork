package B;

public class Rectangle extends Shape {

    public Rectangle() {
    }

    public Rectangle(char symbol) {
        setSymbol(symbol);
    }

    @Override
    void draw() {
        char symbol = getSymbol();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1 && (j == 1 || j == 2)) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }

    void draw(char c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1 && (j == 1 || j == 2)) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}
