package week8;

import java.util.Arrays;

public class kthSmallest {
    public static void main(String[] args){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        kthSmallest(matrix, k);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int l = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[l++] = matrix[i][j];
            }
        }

        Arrays.sort(result);
        System.out.println(result[k-1]);
        return result[k-1];
    }
}
