class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] occ = new int[26];
        
        for(int i = 0; i < word1.length(); i++){
            occ[word1.charAt(i) - 97]++;
        }
        
        for(int i = 0; i < word2.length(); i++){
            occ[word2.charAt(i) - 97]--;
        }
        
        for(int i = 0; i < occ.length; i++){
            if(occ[i] > 3 || occ[i] < -3){
                return false;
            }
        }
        return true;
    }
}
