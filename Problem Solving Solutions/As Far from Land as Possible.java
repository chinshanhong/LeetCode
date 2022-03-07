class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i, j});
                    vis[i][j] = true;
                }
            }
        }
        if(q.isEmpty() || q.size() == n * m) return -1;
        int[] dir = {-1, 0, 1, 0, -1};
        int maxDistance = 0;
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] top = q.poll();
                int currX = top[0], currY = top[1];
                for(int j = 0; j < dir.length - 1; j++){
                    int x = currX + dir[j], y = currY + dir[j + 1];
                    if(x < 0 || x == n || y < 0 || y == m || vis[x][y]) continue;
                    if(grid[x][y] == 1) continue;
                    maxDistance = Math.max(maxDistance, level);
                    vis[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }
            level++;
        }
        return maxDistance;
    }
}
