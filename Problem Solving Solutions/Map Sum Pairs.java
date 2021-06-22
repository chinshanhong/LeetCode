class MapSum {
    HashMap<String, Integer> map;

    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        if(!map.containsKey(key)){
            map.put(key, val);
        }
        else{
            map.replace(key, val);
        }
    }
    
    public int sum(String prefix) {
        
        int sum = 0;
        
        Set set = map.entrySet();
        
        Iterator i = set.iterator();
        
        while(i.hasNext()){
            Map.Entry element = (Map.Entry)i.next();
            if(((String)(element.getKey())).startsWith(prefix)){
                sum += (Integer)element.getValue();
            }
        }
        
        return sum;
    }
    
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
