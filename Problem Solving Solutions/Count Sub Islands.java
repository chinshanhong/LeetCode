class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res = 0;
        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[i].length; j++){
                if(grid2[i][j] == 1){
                    boolean isSubIsland = dfs(grid1, grid2, i, j);
                    if(isSubIsland) res++;
                }
            }
        }
        return res;
    }
    
    public static boolean dfs(int[][] grid1, int[][] grid2, int r, int c){
        if(r >= grid2.length || r < 0 || c >= grid2[0].length || c < 0 || grid2[r][c] == 0){
            return true;
        }
        if(grid1[r][c] == 0){
            return false;
        }
        grid2[r][c] = 0;
        return dfs(grid1, grid2, r + 1, c) 
            & dfs(grid1, grid2, r - 1, c)
            & dfs(grid1, grid2, r, c + 1)
            & dfs(grid1, grid2, r, c - 1);
    }
}
