package week1;

/***
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * You are also given three integers sr, sc, and color.
 * You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel,
 * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color), and so on.
 * Replace the color of all of the aforementioned pixels with color.
 * Return the modified image after performing the flood fill.
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 */
public class floodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfsUtil(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void dfsUtil(int[][] image, int sr, int sc, int color, int index) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != index) return;

        image[sr][sc] = color;
        dfsUtil(image, sr + 1, sc, color, index);
        dfsUtil(image, sr - 1, sc, color, index);
        dfsUtil(image, sr, sc + 1, color, index);
        dfsUtil(image, sr, sc - 1, color, index);
    }
}
