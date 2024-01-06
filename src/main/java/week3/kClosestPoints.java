package week3;

import java.util.Arrays;

/***
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 *
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 *
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class kClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2)->(p1[0]*p1[0]+p2[0]*p2[0]-p1[1]*p1[1]-p2[1]*p2[1]));
        return Arrays.copyOfRange(points, 0, k);
    }
}
