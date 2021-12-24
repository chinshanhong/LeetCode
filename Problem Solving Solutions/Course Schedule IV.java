class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
        ArrayList<Boolean> res = new ArrayList<>();
        
        if(prerequisites.length == 0){
            for(int i = 0; i < queries.length; i++){
                res.add(false);
            }
            return res;
        }
        else{
            ArrayList<Integer>[] adjacencyList = new ArrayList[numCourses];
           
            for(int i = 0; i < numCourses; i++){
                adjacencyList[i] = new ArrayList<>();
            }
            
            for(int i = 0; i < prerequisites.length; i++){
                adjacencyList[prerequisites[i][0]].add(prerequisites[i][1]);
            }
            
            skip:for(int i = 0; i < queries.length; i++){
                boolean[] visited = new boolean[numCourses];
                Queue<Integer> queue = new LinkedList<>();
                
                visited[queries[i][0]] = true;
                queue.add(queries[i][0]);
                
                while(!queue.isEmpty()){
                    int s = queue.poll();
                    
                    Iterator<Integer> j = adjacencyList[s].listIterator();
                    while(j.hasNext()){
                        int n = j.next();
                        if(n == queries[i][1]){
                            res.add(true);
                            continue skip;
                        }
                        if(!visited[n]){
                            visited[n] = true;
                            queue.add(n);
                        }
                    }
                }
                
                res.add(false);
            }
        }
        return res;
    }
}
