class MyHashSet {
    private LinkedList<Integer> list;

    public MyHashSet() {
        list = new LinkedList<>();    
    }
    
    public void add(int key) {
        if(!list.contains(key)){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        list.remove((Integer)key);
    }
    
    public boolean contains(int key) {
        return list.contains((Integer)key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
