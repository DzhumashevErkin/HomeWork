package Disemvowel_Trolls;

public class Main {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
    public static String disemvowel(String str) {
        char[] ch = str.toCharArray();
        String newStr = "";
        for (char c:ch) {
            if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
            else newStr+=c;
        }
        return newStr;
    }
}
