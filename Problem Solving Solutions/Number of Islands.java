class Solution {
    public int numIslands(char[][] grid) {
        int colLength = grid.length;
        int rolLength = grid[0].length;
        
        int[] parent = new int[rolLength * colLength];
        
        for(int i = 0; i < parent.length; i++){
            parent[i] = -1;
        }
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] =='0'){
                    parent[i * rolLength + j] = parent.length;
                    continue;
                }
                if(i - 1 >= 0 && grid[i - 1][j] == '1'){
                    union(parent, (i * rolLength) + j, ((i - 1) * rolLength) + j);
                }
                if(i + 1 < colLength && grid[i + 1][j] == '1'){
                    union(parent, (i * rolLength) + j, (i + 1) * rolLength + j);
                }
                if(j + 1 < rolLength && grid[i][j + 1] == '1'){
                    union(parent, (i * rolLength) + j, i * rolLength + j + 1);
                }
                if(j - 1 >= 0 && grid[i][j - 1] == '1'){
                    union(parent, (i * rolLength) + j, i * rolLength + j - 1);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < parent.length; i++){
            if(parent[i] <= -1){
                res++;
            }
        }
        return res;
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
}
