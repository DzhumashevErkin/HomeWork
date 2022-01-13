package Two_Sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3},4)));
    }
    public static int[] twoSum(int[] numbers, int target)
    {
        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                sum+=numbers[j];
                if(sum==target) return new int[]{i,j};
                else sum = numbers[i];
            }
        }

        return null;
    }
}
