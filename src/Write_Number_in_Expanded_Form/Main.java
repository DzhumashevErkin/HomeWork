package Write_Number_in_Expanded_Form;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int num) {
        String s = "";
        int count = 10;
        int countNumbers = 1;
        while (num / count > 0) {
            countNumbers++;
            count *= 10;
        }
        int[] arr = new int[countNumbers];
        count = 10;
        int countI = 0;
        while (num> 0) {
            arr[countI] = num%10;
            num/=10;
            countI++;
        }
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]!=0) {
                if(i!=arr.length-1) s+= " + " + arr[i] * (int)Math.pow(10,i);
                else s+=arr[i] * (int)Math.pow(10,i);
            }

        }
        System.out.println(countNumbers);
        System.out.println(Arrays.toString(arr));
        return s;
    }
}
