package Square_into_Squares;

public class Main {
    public static void main(String[] args) {
        System.out.println(decompose(4));
    }
    public static String decompose(long n) {
        String result = null;

        for (long i = n - 1; i > 1; i--) {
            long square = n * n;
            result = recursiveDecompose(i, square);
            if (result != null) break;
        }
//        if(result==null) return "Nothing";
        return result;
    }

    public static String recursiveDecompose(long i, long square) {
        if (i * i == square) {
            return i + "";
        } else if (i * i < square) {
            square = square - i * i;

            for (long j = i - 1; j > 0; j--) {
                String template = recursiveDecompose(j, square);

                if (template != null) {
//                    System.out.println(template + " " + i);
                    return template + " " + i;
                } else {
                    continue;
                }
            }
        } else {
            return null;
        }

        return null;
    }
}
