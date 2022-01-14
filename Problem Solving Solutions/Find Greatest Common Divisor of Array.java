class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1001;
        
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]) max = nums[i];
            if(min > nums[i]) min = nums[i];
        }
        
        return helper(max, min);
    }
    
    public static int helper(int max, int min){
        int gcd = 1;
        
        for(int i = 1; i <= min; i++){
            if(max % i == 0 && min % i == 0){
                gcd = i;
            }
        }
        
        return gcd;
    }
}
