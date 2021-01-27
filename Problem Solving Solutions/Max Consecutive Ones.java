class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutiveOne = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                consecutiveOne = 0;
            }
            else{
                consecutiveOne++;
                max = Math.max(max, consecutiveOne);
            }
        }
        return max;
    }
}
