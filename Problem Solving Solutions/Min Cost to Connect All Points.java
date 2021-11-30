class Solution {
    public int minCostConnectPoints(int[][] points) {
        int[][] edges = new int[points.length][points.length];
        
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                int x = Math.abs(points[i][0] - points[j][0]);
                int y = Math.abs(points[i][1] - points[j][1]);
                int val = x + y;
                edges[i][j] = val;
                edges[j][i] = val;
            }
        }
        
        return primMST(edges);
    }
    
    public static int primMST(int[][] edges){
        
        int[] key =  new int[edges.length];
        boolean[] mstSet = new boolean[edges.length];
        
        for(int i = 1; i < edges.length; i++){
            key[i] = Integer.MAX_VALUE;
        }
        
        for(int i = 0; i < edges.length - 1; i++){
            int u = getMinimumKey(key, mstSet);
            mstSet[u] = true;
            
            for(int j = 0; j < edges.length; j++){
                if(edges[u][j] != 0 && mstSet[j] == false && edges[u][j] < key[j]){
                    key[j] = edges[u][j];
                }
            }
        }
        
        int res = 0;
        for(int i = 0; i < key.length; i++){
            res += key[i];
        }
        
        return res;
    }
    
    public static int getMinimumKey(int[] key, boolean[] mstSet){
        int min = Integer.MAX_VALUE, min_index = -1;
        
        for(int i = 0; i < key.length; i++){
            if(mstSet[i] == false && key[i] < min){
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
