package Twice_linear;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(dblLinear(10));
        System.out.println(dblLinear(20));
        System.out.println(dblLinear(30));
        System.out.println(dblLinear(50));
        System.out.println(dblLinear(100));
        System.out.println(dblLinear(200));
//        System.out.println(dblLinear(13000));
    }

    public static int dblLinear(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int count = 1;
        for (int i = 0; i + count + 1 < arr.length; i++) {
            arr[i + count] = arr[i] * 2 + 1;
            arr[i + count + 1] = arr[i] * 3 + 1;
            count++;
        }
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == arr[i+1]) n++;
//        }
//        n++;


        n++;
        int[] u = new int[n];
        for (int i = 0; i < u.length; i++) {
            u[i] = 1;
        }
        int pt2 = 0, pt3 = 0; //two pointer

        for(int i = 1;i<n;i++){
            u[i] = Math.min(2* u[pt2] + 1, 3*u[pt3] + 1);
            if(u[i] == 2 * u[pt2] + 1) pt2++;
            if(u[i] == 3 * u[pt3] + 1) pt3++;
        }
        //System.out.println(Arrays.toString(u));
        return u[n-1];


//        return arr[n];
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }



        return array;

    }

}
