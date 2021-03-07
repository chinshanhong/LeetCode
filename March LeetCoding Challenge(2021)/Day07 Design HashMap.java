class MyHashMap {
    private int[] array = new int[100001];
    /** Initialize your data structure here. */
    public MyHashMap() {
        for(int i = 0; i < array.length; i++) array[i] = -1;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        array[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return array[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        array[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
