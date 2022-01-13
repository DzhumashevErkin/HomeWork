package Digital_Root;

public class Main {
    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
    }
    public static int digital_root(int n) {
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int sum = 0;
        for (int i:newGuess) {
            sum+=i;
        }
        if(sum>9) return digital_root(sum);
        else return sum;
    }
}
