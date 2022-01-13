package Find_the_missing_letter;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a','b','c','d','f'}));
        System.out.println(findMissingLetter(new char[]{'O','Q','R','S'}));
    }
    public static char findMissingLetter(char[] array)
    {
        char[] alphabetLow = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetHight = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        if(Character.isLowerCase(array[0])){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < alphabetLow.length; j++) {
                    if(array[i] == alphabetLow[j]){
                        while (i < array.length || j < alphabetLow.length){
                            i++;j++;
                            if(array[i]!=alphabetLow[j]) return alphabetLow[j];
                        }
                    }
                }

            }
        }
        else
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < alphabetHight.length; j++) {
                    if(array[i] == alphabetHight[j]){
                        while (i < array.length || j < alphabetHight.length){
                            i++;j++;
                            if(array[i]!=alphabetHight[j]) return alphabetHight[j];
                        }
                    }
                }

            }
        return ' ';
    }
}
