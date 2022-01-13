package Is_a_number_prime;

public class Main {
    public static void main(String[] args) {
        System.out.println(Double.toString(Math.pow(2, 32)));
    }

    public static boolean isPrime(int num) {
        if(num==2 || num==3) return true;
        if(num<2 || num%2==0) return false;
        else{
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i==0) return false;
            }
            return true;
        }
    }
}
