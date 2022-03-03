class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        boolean[][] painted = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, newColor, painted);
        return image;
    }
    
    public static void helper(int[][] image, int m, int n, int color, int newColor, boolean[][] painted){
        if(image[m][n] == color){
            image[m][n] = newColor;
            painted[m][n] = true;
        }
        if(m - 1 >= 0 && image[m - 1][n] == color && !painted[m - 1][n]){
            helper(image, m - 1, n, color, newColor, painted);
        }
        if(m + 1 < image.length && image[m + 1][n] == color && !painted[m + 1][n]){
            helper(image, m + 1, n, color, newColor, painted);
        }
        if(n - 1 >= 0 && image[m][n-1] == color && !painted[m][n -1]){
            helper(image, m, n - 1, color, newColor, painted);
        }
        if(n + 1 < image[0].length && image[m][n + 1] == color && !painted[m][n + 1]){
            helper(image, m , n + 1, color, newColor, painted);
        }
    }
}
