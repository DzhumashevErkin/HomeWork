package Total_increasing_or;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(totalIncDec(BigInteger.valueOf(10),BigInteger.valueOf(10)));
        Math.min(3,4);
    }
    public static BigInteger totalIncDec(BigInteger x, BigInteger y){
        return (Fact((x.add(y)).subtract(BigInteger.ZERO))).divide(Fact(y).multiply(Fact(x.subtract(y)))).multiply(BigInteger.valueOf(2))
                .subtract(y).subtract((y.multiply(BigInteger.valueOf(9))).add(BigInteger.ONE));
    }
    public static BigInteger Fact(BigInteger n){
        if(n.compareTo(BigInteger.valueOf(1))<=0) return BigInteger.ONE;
        else return n.multiply(Fact(n.subtract(BigInteger.valueOf(1))));
    }
}
