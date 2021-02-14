Credits to happygirlzt
class Solution {
    public boolean isBipartite(int[][] graph) {
        int nodes = graph.length;
        int[] colors = new int[nodes];
        for(int i = 0; i < nodes; i++){
            if(colors[i] == 0 && !dfs(graph, colors, 1, i)) return false;
        }
        return true;
    }
    public boolean dfs(int[][] graph, int[] colors, int color, int node){
        if(colors[node] != 0){
            return colors[node] == color;
        }
        else{
            colors[node] = color;
            for(int neigh : graph[node]){
                if(!dfs(graph, colors, -color, neigh)) return false;
            }
            return true;
        }
    }
}
