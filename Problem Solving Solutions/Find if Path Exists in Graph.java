class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
        if(n == 1){
            if(start == end){
                return true;
            }
            else{
                return false;
            }
        }
        
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.addLast(start);
        
        while(!queue.isEmpty()){
            int u = queue.removeFirst();
            for(int[] edge : edges){
                if(edge[0] == u){
                    if(edge[1] == end){
                        visited[edge[1]] = true;
                        return true;
                    }
                    else{
                        if(visited[edge[1]] == true) continue;
                        visited[edge[1]] = true;
                        queue.addLast(edge[1]);
                    }
                }
                
                else if(edge[1] == u){
                    if(edge[0] == end){
                        visited[edge[0]] = true;
                        return true;
                    }
                    else{
                        if(visited[edge[0]] == true) continue;
                        visited[edge[0]] = true;
                        queue.addLast(edge[0]);
                    }
                }
            }
        }
        return visited[end];
    }
}
