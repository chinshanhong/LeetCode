class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] parent = new int[isConnected.length];
        
        for(int i = 0; i < parent.length; i++){
            parent[i] = -1;
        }
        
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[i].length; j++){
                if(isConnected[i][j] == 1){
                    int iParent = find(parent, i);
                    int jParent = find(parent, j);
                    
                    if(iParent != jParent){
                        union(parent, iParent, jParent);
                    }
                }
            }
        }
        
        int provinceNum = 0;
        for(int i = 0; i < parent.length; i++){
            if(parent[i] < 0){
                provinceNum++;
            }
        }
        return provinceNum;
        
    }
    
    public static int find(int[] parent, int i){
        if(parent[i] >= 0){
            return find(parent, parent[i]);
        }
        return i;
    }
    
    public static void union(int[] parent, int x, int y){
        int xRootValue = parent[x];
        int yRootValue = parent[y];
        
        if(Math.abs(xRootValue) > Math.abs(yRootValue)){
            parent[x] += parent[y];
            parent[y] = x;
        }
        else if(Math.abs(yRootValue) > Math.abs(xRootValue)){
            parent[y] += parent[x];
            parent[x] = y;
        }
        else{
            parent[y] += parent[x];
            parent[x] = y;
        }
    }
}
