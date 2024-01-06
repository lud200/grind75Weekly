package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi]
 * represent the start and the end of the ith interval and intervals is sorted in ascending order by starti.
 * You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by
 * starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 *
 * Return intervals after the insertion.
 *
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * Example 2:
 *
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */
public class insertInterval {
    public static void main(String[] args){
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int newInterval[] = {4, 8};
        insert(intervals, newInterval);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        int[][] result = Arrays.copyOf(intervals, n+1);
        result[n] = newInterval;

        return intervalUtil(result);
    }

    public static int[][] intervalUtil(int[][] intervals){
        Arrays.sort(intervals, (i1, i2)->Integer.compare(i1[0], i2[0]));

        int[] newInterval = intervals[0];
        List<int[]> lst = new ArrayList<>();
        lst.add(newInterval);

        for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }else{
                newInterval = interval;
                lst.add(newInterval);
            }
        }

        return lst.toArray(new int[lst.size()][]);
    }
}
