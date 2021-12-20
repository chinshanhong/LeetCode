class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] intDegree = new int[numCourses];
        
        for(int[] i : prerequisites){
            intDegree[i[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < intDegree.length; i++){
            if(intDegree[i] == 0){
                queue.add(i);
            }
        }
        
        int count = 0;
        
        while(!queue.isEmpty()){
            int v = queue.poll();

            for(int[] i : prerequisites){
                if(i[1] == v){
                    if(--intDegree[i[0]] == 0){
                        queue.add(i[0]);
                    }
                }
            }
            count++;
        }
        
        return count == numCourses;
    }
}
