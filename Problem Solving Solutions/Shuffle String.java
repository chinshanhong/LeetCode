class Solution {
    public String restoreString(String s, int[] indices) {
        String[] temp = s.split("");
        
        for(int i = 0; i < s.length(); i++){
            int newPosition = indices[i];
            temp[newPosition] = s.charAt(i) + "";
        }
        
        String res = "";
        for(int i = 0; i < temp.length; i++){
            res += temp[i];
        }
        
        return res;
    }
}
