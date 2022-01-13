package Number_of_trailing_zeros_of_N;

public class Main {
    public static void main(String[] args) {
        System.out.println(zeros(6));

    }
    public static int zeros(int n) {
        if(n==0) return 0;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            count+=n/Math.pow(5,i);
        }
        return count;
    }

    public static int getNumber(int number,int n){
        int count = 0;
        while(number%n==0){
            count++;
            number/=n;
        }
        return count;
    }
}
