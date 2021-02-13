//Credits goes to Google SWE Interview Prep
class Solution {
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {1,1}, {1,-1}, {-1,0}, {-1,1}, {-1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        //BFS
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        int count = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] poll = queue.poll();
                if(poll[0] == m - 1 && poll[1] == n-1){
                    return count + 1;
                }
                for(int[] dir : directions) {
                    int x = dir[0] + poll[0];
                    int y = dir[1] + poll[1];
                    if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 0 && !visited[x][y]){
                        queue.add(new int[]{x,y});
                        visited[x][y] = true;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
