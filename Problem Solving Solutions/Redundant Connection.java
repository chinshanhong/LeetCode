class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = null;
        int[] parent = new int[edges.length];
        
        for(int i = 0; i < parent.length; i++){
            parent[i] = -1;
        }
        
        for(int i = 0; i < edges.length; i++){
            int x = find(parent, edges[i][0] - 1);
            int y = find(parent, edges[i][1] - 1);
            if(x != y){
                union(parent, x, y);
            }
            else{
                res = edges[i];
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
        if(Math.abs(parent[x]) > Math.abs(parent[y])){
            parent[x]+=parent[y];
            parent[y] = x;
        }
        else if(Math.abs(parent[y]) > Math.abs(parent[x])){
            parent[y]+=parent[x];
            parent[x] = y;
        }
        else{
            parent[x]+=parent[y];
            parent[y] = x;
        }
    }
}
