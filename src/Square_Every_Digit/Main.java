package Square_Every_Digit;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.squareDigits(9119));
    }
    public int squareDigits(int n) {
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        String sum = "";
        for (int i = 0; i < temp.length(); i++)
        {
            sum+= (temp.charAt(i) - '0')*(temp.charAt(i) - '0');
        }
        return Integer.parseInt(sum);
    }
}
