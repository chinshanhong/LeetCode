class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ArrayList<Integer>[] list = (ArrayList<Integer>[]) new ArrayList[n];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i < edges.length; i++){
            list[edges[i][1]].add(edges[i][0]); 
        }
        
        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[n];
            List<Integer> currentList = new ArrayList<>();
            dfs(list, currentList, visited, i);
            Collections.sort(currentList);
            res.add(currentList);
        }
        return res;
    }
    
    public static void dfs(List<Integer>[] list,
                                         List<Integer> currentList,
                                         boolean[] visited,
                                         int u){
        visited[u] = true;
        for(int i = 0; i < list[u].size(); i++){
            if(!visited[list[u].get(i)]){
                currentList.add(list[u].get(i));
                dfs(list, currentList, visited, list[u].get(i));
            }
        }
    }
}
