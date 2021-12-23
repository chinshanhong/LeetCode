class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < s1.split(" ").length; i++){
            if(!map.containsKey(s1.split(" ")[i])){
                map.put(s1.split(" ")[i], 1);
            }
            else{
                map.replace(s1.split(" ")[i], map.get(s1.split(" ")[i]) + 1);
            }
        }
        
        for(int i = 0; i < s2.split(" ").length; i++){
            if(!map.containsKey(s2.split(" ")[i])){
                map.put(s2.split(" ")[i], 1);
            }
            else{
                map.replace(s2.split(" ")[i], map.get(s2.split(" ")[i]) + 1);
            }
        }
        
        int size = 0;
        
        for(String i : map.keySet()){
            if(map.get(i) == 1){
                size++;
            }
        }
        
        int idx = 0;
        String[] res = new String[size];
        
        for(String i : map.keySet()){
            if(map.get(i) == 1){
                res[idx++] = i;
            }
        }
        
        return res;
    }
}
