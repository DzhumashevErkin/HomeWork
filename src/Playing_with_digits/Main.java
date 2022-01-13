package Playing_with_digits;

public class Main {
    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(695, 2));
        System.out.println(digPow(46288, 3));
    }

    public static long digPow(int n, int p) {
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int sum = 0;
        for (int i = 0; i < newGuess.length; i++) {
            sum += Math.pow(newGuess[i], p + i );
        }
        if (sum % n == 0) return sum / n;
        else return -1;


    }
}
