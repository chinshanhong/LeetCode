class Solution {
    public char findTheDifference(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        char res = ' ';
        
        for(int i = 0; i < t.length(); i++){
            if(i < s.length()){
                sArr[s.charAt(i) - 97]++;
            }
            tArr[t.charAt(i) - 97]++;
        }
        
        for(int i = 0; i < tArr.length; i++){
            if(tArr[i] > sArr[i]){
                res = (char)(i + 97);
            }
        }
        return res;
    }
}
