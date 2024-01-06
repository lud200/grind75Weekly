package week3;

/***
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 * Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: [[0,0,0],[0,1,0],[0,0,0]]
 *
 * Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
 * Output: [[0,0,0],[0,1,0],[1,2,1]]
 */
public class matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int maxLen = m+n;
        int[][] result = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) continue;

                result[i][j] = maxLen;
                if(i>0){
                    result[i][j] = Math.min(result[i][j], result[i-1][j]+1);
                }

                if(j>0){
                    result[i][j] = Math.min(result[i][j], result[i][j-1]+1);
                }

            }
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(mat[i][j]==0) continue;

                if(i<m-1){
                    result[i][j] = Math.min(result[i][j], result[i+1][j]+1);
                }

                if(j<n-1){
                    result[i][j] = Math.min(result[i][j], result[i][j+1]+1);
                }
            }
        }

        return result;


    }
}
