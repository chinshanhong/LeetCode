class Solution {
    public int removeStones(int[][] stones) {
        if(stones.length == 1){
            return 0;
        }
        UnionFind uf = new UnionFind();
        for(int i = 0; i < stones.length; i++){
            uf.union(stones[i][0] + 10001, stones[i][1]);
        }
        return stones.length - uf.getCount();
    }
    private class UnionFind{
        private HashMap<Integer, Integer> parent;
        private int count;
        
        public UnionFind(){
            this.parent = new HashMap<Integer, Integer>();
            this.count = 0;
        }
        
        public int getCount(){
            return count;
        }
        
        public int find(int x){
            if(!parent.containsKey(x)){
                parent.put(x, x);
                count++;
            }
            if(x != parent.get(x)){
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }
        
        public void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);
            
            if(rootX == rootY){
                return;
            }
            parent.put(rootX, rootY);
            count--;
        }
    }
}
    
