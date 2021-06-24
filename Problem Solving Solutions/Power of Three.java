class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0){
            return helper(-1, n);
        }
        else{
            return helper(1, n);
        }
    }
    
    public boolean helper(int m, int n){
        
        if(m > n){
            return false;
        }
        if(m < 0 && m < n){
            return false;
        }
        if(m == n){
            return true;
        }
        
        return helper(m * 3, n);
    }
}
