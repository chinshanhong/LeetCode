class Solution {
    public int closedIsland(int[][] grid) {
        int res = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    boolean isClosed = helper(grid, i, j);
                    if(isClosed) res++;
                }
            }
        }
        return res;
    }
    
    public static boolean helper(int[][] grid, int r, int c){
        if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0){
            return false;
        }
        if(grid[r][c] == 1){
            return true;
        }
        grid[r][c] = 1;
        
        boolean top = helper(grid, r - 1, c);
        boolean down = helper(grid, r + 1, c);
        boolean left = helper(grid, r, c - 1);
        boolean right = helper(grid, r, c + 1);
        
        return top && down && left && right;
    }
}
