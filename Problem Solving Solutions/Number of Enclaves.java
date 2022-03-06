class Solution {
    public int numEnclaves(int[][] grid) {
        int res = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    if(j == 0 || j == grid[0].length - 1 || i == 0 || i == grid.length - 1){
                        dfs(grid, i, j);
                    }
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    res++;
                }
            }
        }
        return res;
    }
    
    public static void dfs(int[][] grid, int r, int c){
        if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0 || grid[r][c] == 0){
            return;
        }
        if(grid[r][c] == 1){
            grid[r][c] = 0;
        }
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
