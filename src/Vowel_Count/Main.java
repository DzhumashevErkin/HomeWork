package Vowel_Count;

public class Main {
    public static void main(String[] args) {

    }
    //a, e, i, o, u
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] ch = str.toCharArray();
        for (char c:ch) {
            if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') vowelsCount++;
        }
        return vowelsCount;
    }
}
