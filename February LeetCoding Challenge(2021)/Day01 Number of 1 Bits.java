public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int countOne = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                countOne++;
            }
        }
        return countOne;
        
        //More efficent solution using recursive function
        if (n == 0)
             return 0;
         else
             return 1 + hammingWeight(n & (n - 1));
