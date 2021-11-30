class Solution {
    public int findCenter(int[][] edges) {
        int maxNode = 1;
        for(int i = 0; i < edges.length; i++){
            int max = Math.max(edges[i][0], edges[i][1]);
            if(maxNode < max){
                maxNode = max;
            }
        }
        int[] edgeCount = new int[maxNode];
        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < edges[i].length; j++){
                edgeCount[edges[i][j] - 1]++;
            }
        }
        
        for(int i = 0; i < edgeCount.length; i++){
            if(edgeCount[i] != 1){
                return i + 1;
            }
        }
        return 0;
    }
}
