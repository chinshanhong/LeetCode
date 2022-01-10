class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        
        int d = 0;
        
        int k = a.length() - 1;
        int l = b.length() - 1;
        
        while(k >= 0 || l >= 0 || d == 1){
            d += ((k >= 0) ? a.charAt(k) - '0' : 0);
            d += ((l >= 0) ? b.charAt(l) - '0' : 0);
            
            res = (char)(d % 2 + '0') + res;
            
            d /= 2;
            
            k--;
            l--;
        }
        
        return res;
    }
}
