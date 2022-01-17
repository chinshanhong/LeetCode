class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() != s.split(" ").length){
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] words = s.split(" ");
        
        
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i)) && !map.values().contains(words[i])){
                map.put((pattern.charAt(i)), words[i]);
            }
            else if(!map.containsKey(pattern.charAt(i)) && map.values().contains(words[i])){
                return false;
            }
            else if(map.containsKey(pattern.charAt(i)) 
                    && !map.get(pattern.charAt(i)).equals(words[i])){
                return false;
            }
        }
        return true;
    }
}
