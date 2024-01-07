package week6;

import java.util.ArrayList;
import java.util.List;

/***
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 */
public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int rowBeg = 0, rowEnd = matrix.length-1;
        int colBeg = 0, colEnd = matrix[0].length-1;

        while(rowBeg<=rowEnd && colBeg<=colEnd){
            for(int i=colBeg;i<=colEnd;i++){
                result.add(matrix[rowBeg][i]);
            }
            rowBeg++;

            for(int i=rowBeg;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowBeg<=rowEnd){
                for(int i=colEnd;i>=colBeg;i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if(colBeg<=colEnd){
                for(int i=rowEnd;i>=rowBeg;i--){
                    result.add(matrix[i][colBeg]);
                }
                colBeg++;
            }
        }
        return result;

    }
}
