package Tribonacci_Sequence;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 5)));
    }
    public static double[] tribonacci(double[] s, int n) {
        double[] d = new double[n];
        if(n==0) return d;
        else if(n<0) return null;
        else if (n <= s.length) {
            for (int i = 0; i < n; i++) {
                d[i] = s[i];
            }
            return d;
        }
        else
            for (int i = 0; i < n; i++) {
                if(i<s.length){
                    d[i] = s[i];
                }
                else d[i] = d[i-1] + d[i-2] + d[i-3];
            }
        return d;
    }
}
