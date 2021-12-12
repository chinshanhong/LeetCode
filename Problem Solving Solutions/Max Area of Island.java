class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] parent = new int[m * n];
        
        for(int i = 0; i < parent.length; i++){
            parent[i] = -1;
        }
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    parent[i * n + j] = parent.length;
                    continue;
                }
                else{
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){
                        union(parent, i * n + j, (i - 1) * n + j);
                    }
                    if(i + 1 < m && grid[i + 1][j] == 1){
                        union(parent, i * n + j, (i + 1) * n + j);
                    }
                    if(j + 1 < n && grid[i][j + 1] == 1){
                         union(parent, i * n + j, i * n + (j + 1));
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] == 1){
                         union(parent, i * n + j, i * n + (j - 1));
                    }
                }
            }
        }
        return -(findMaxArea(parent));
    }
    
    public static int find(int[] parent, int i){
        if(parent[i] >= 0){
            return find(parent, parent[i]);
        }
        return i;
    }
    
    public static void union(int[] parent, int x, int y){
        int xParent = find(parent, x);
        int yParent = find(parent, y);
        
        if(xParent != yParent){
            if(parent[xParent] < parent[yParent]){
                parent[xParent] += parent[yParent];
                parent[yParent] = xParent;
            }
            else if(parent[yParent] < parent[xParent]){
                parent[yParent] += parent[xParent];
                parent[xParent] = yParent;
            }
            else{
                parent[xParent] += parent[yParent];
                parent[yParent] = xParent;
            }
        }
    }
    
    public static int findMaxArea(int[] parent){
        int max = 0;
        for(int i = 0; i < parent.length; i++){
            if(parent[i] < 0){
                if(parent[i] < max){
                    max = parent[i];
                }
            }
        }
        return max;
    }
}
