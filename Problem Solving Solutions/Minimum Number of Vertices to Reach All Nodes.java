class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegree = new int[n];
        
        for(int i = 0; i < edges.size(); i++){
            for(int j = 0; j < edges.get(i).size() - 1; j++){
                inDegree[edges.get(i).get(j + 1)]++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                list.add(i);
            }
        }
        
        return list;
    }
}
