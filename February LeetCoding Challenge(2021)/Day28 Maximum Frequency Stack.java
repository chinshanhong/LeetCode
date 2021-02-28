//Credits goes to Edvin He

class FreqStack {
    
    private PriorityQueue<Node> pq = null;
    private HashMap<Integer, Integer> hashMap = null;
    private int index = 0;

    public FreqStack() {
        hashMap = new HashMap<Integer, Integer>();
        pq = new PriorityQueue<Node>();
    }
    
    public void push(int x) {
        
        if(hashMap.containsKey(x)) hashMap.put(x, hashMap.get(x) + 1);
        else hashMap.put(x, 1);
        
        pq.offer(new Node(x, hashMap.get(x), index++));
    }
    
    public int pop() {
        int v = pq.remove().val;
        
        int freq = hashMap.get(v);
        if(freq == 1) hashMap.remove(v);
        else hashMap.put(v, hashMap.get(v) - 1);
        return v;
    }
    
    class Node implements Comparable<Node>{
        int val;
        int freq;
        int index;
        
        public Node(int v, int f, int index){
            this.val = v;
            this.freq = f;
            this.index = index;
        }
        
        public int compareTo(Node node){
            if(this.freq == node.freq) return node.index - this.index;
            return node.freq - this.freq;
        }
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
