package week7;

/***
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 */
public class wordBreak {
    int m, n;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j] && dfsutil(i, j, board, word, 0))
                    return true;
            }
        }

        return false;
    }

    public boolean dfsutil(int i, int j, char[][] board, String word, int index){
        if(word.length() == index) return true;

        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(index) || visited[i][j]) return false;

        visited[i][j] = true;
        if(dfsutil(i+1, j, board, word, index+1)
        || dfsutil(i-1, j, board, word, index+1)
        || dfsutil(i, j+1, board, word, index+1)
        || dfsutil(i, j-1, board, word, index+1)) return true;

        visited[i][j] = false;
        return false;
    }
}
