package Sum_of_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println((sumIntervals(new int[][]{
                {2345, 9479}, {-9696, -3559}, {8969, 9746}, {-2106, 7625}, {3108, 3964},
            {-4436, 4015}, {-586, 7779}, {5576, 9398}, {-4478, 1192}, {389, 2637}, {-8382, -6861},
                {-9424, 9915}, {-8509, -2150}, {2816, 3342}
        })));
    }

    public static int sumIntervals(int[][] intervals) {
        if(intervals==null) return 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int l = 0; l < intervals.length; l++) {
                if (intervals[i][1] > intervals[l][0] && intervals[i][0] < intervals[l][1] && intervals[i][0] <= intervals[l][0] && intervals[i][1]<intervals[l][1]) {
                    intervals[i][1] = intervals[l][1];
                    intervals[l][0] = -777777; intervals[l][1] = -777777;
                }
                if(intervals[i][0]<intervals[l][0] && intervals[i][1]>intervals[l][1]){
                    intervals[l][0] = -777777; intervals[l][1] = -777777;
                }
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            for (int l = 0; l < intervals.length; l++) {
                if (intervals[i][1] > intervals[l][0] && intervals[i][0] < intervals[l][1] && intervals[i][0] <= intervals[l][0] && intervals[i][1]<intervals[l][1]) {
                    sumIntervals(intervals);
                }
                if(intervals[i][0]<intervals[l][0] && intervals[i][1]>intervals[l][1]){
                    sumIntervals(intervals);
                }
            }
        }
        //System.out.println(Arrays.deepToString(intervals));
        int result = 0;
        for (int i = 0; i < intervals.length; i++) {
            result+=intervals[i][1] - intervals[i][0];
        }
        return result;
    }
}

