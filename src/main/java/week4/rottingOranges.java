package week4;

public class rottingOranges {
    int m,n;
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    dfsUtil(i, j, grid, 2);
                }
            }
        }
        int min = 2;
        for(int[] cell:grid){
            for(int val:cell){
                if(val == 1) return -1;
                min = Math.max(min, val);
            }
        }
        return min-2;
    }

    public void dfsUtil(int i, int j, int[][] grid, int min){
        if(i<0 || j<0 || i>=m || j>=n || 1<grid[i][j] && grid[i][j]<min || grid[i][j]==0) return;

        grid[i][j] = min;

        dfsUtil(i+1, j, grid, min+1);
        dfsUtil(i-1, j, grid, min+1);
        dfsUtil(i, j+1, grid, min+1);
        dfsUtil(i, j-1, grid, min+1);

    }
}
