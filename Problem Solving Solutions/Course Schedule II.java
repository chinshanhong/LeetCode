class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        
        for(int[] i : prerequisites){
            inDegree[i[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }
        
        int[] res = new int[numCourses];
        int count = 0;
        int idx = 0;
        
        while(!queue.isEmpty()){
            int v = queue.poll();
            res[idx++] = v;
            
            for(int[] i : prerequisites){
                if(i[1] == v){
                    if(--inDegree[i[0]] == 0){
                        queue.add(i[0]);
                    }
                }
            }
            
            count++;
        }
        
        if(count == numCourses){
            return res;
        }
        else{
            int[] res2 = new int[0];
            return res2;
        }
    }
}
