class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int[] lps = new int[needle.length()];
        computeLPS(lps, needle);
        
        return searchNeedle(haystack, needle, lps);
    }
    
    public static void computeLPS(int[] lps, String needle){
        int len = 0;
        int i = 1;
        lps[0] = 0;
        
        while(i < needle.length()){
            if(needle.charAt(i) == needle.charAt(len)){
                len++;
                lps[i++] = len;
            }
            else{
                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i++] = len;
                }
            }
        }
    }
    
    public static int searchNeedle(String haystack, String needle, int[] lps){
        int i = 0;
        int j = 0;
        
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if(j == needle.length()){
                return (i - j);
            }
            else if(i < haystack.length() && haystack.charAt(i) != needle.charAt(j)){
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
    }
}
