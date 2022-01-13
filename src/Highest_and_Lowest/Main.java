package Highest_and_Lowest;

public class Main {
    public static void main(String[] args) {
        repeatStr(5, "Hello");
    }
    public static String highAndLow(String numbers) {
        String[] str = numbers.split(" ");
        String newStr = "";
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        for (String s:str) {
            if(min>Integer.parseInt(s)) min = Integer.parseInt(s);
            if(max<Integer.parseInt(s)) max = Integer.parseInt(s);
        }
        return ""+max+" "+min;
    }

    public static int sum(int[] arr){
        int sum=0;
        for (int i :arr) {
            if(i>0) sum+=i;
        }
        return sum;
    }
    public static void repeatStr(final int repeat, final String string){
        for (int i = 0; i < repeat; i++) {
            System.out.print(string);
        }
    }
}
