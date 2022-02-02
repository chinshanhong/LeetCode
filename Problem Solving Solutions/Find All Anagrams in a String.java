class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(p.length() > s.length()){
            return res;
        }

        for(int i = 0; i <= s.length() - p.length(); i++){
            String subString = s.substring(i, i + p.length());
            boolean isAnagram = true;
            
            int[] occ = new int[26];
            
            for(int j = 0; j < p.length(); j++){
                occ[p.charAt(j) - 97]++;
                occ[subString.charAt(j) - 97]--;
            }
             
            
            for(int j = 0; j < p.length(); j++){
                if(occ[p.charAt(j) - 97] != 0){
                    isAnagram = false;
                    break;
                }
            }
            
           if(isAnagram){
               res.add(i);
           }
        }
        return res;
    }
}
