package B;

public class Square extends Shape {

    public Square() {
    }

    public Square(char symbol) {
        setSymbol(symbol);
    }

    @Override
    void draw() {
        char symbol = getSymbol();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j==1) {
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
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j==1) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}
