class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        
        return dp(nums, 0, memo);
    }
    
    public int dp(int[] nums, int start, int[] memo){
        if(start >= nums.length){
            return 0;
        }
        
        if(memo[start] != -1) return memo[start];
        
        int res = Math.max(dp(nums, start + 1, memo),
                           nums[start] + dp(nums, start + 2, memo));
        memo[start] = res;
        return res;
    }
}
