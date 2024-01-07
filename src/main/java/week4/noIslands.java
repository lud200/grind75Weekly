package week4;

/***
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 */
public class noIslands {
    int m,n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int islandCount = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    islandCount++;
                    dfsUtil(i, j, grid);
                }
            }
        }

        return islandCount;
    }
    public void dfsUtil(int i, int j, char[][] grid){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!='1') return;

        grid[i][j] = '0';
        dfsUtil(i+1, j, grid);
        dfsUtil(i-1, j, grid);
        dfsUtil(i, j+1, grid);
        dfsUtil(i, j-1, grid);
    }
}
