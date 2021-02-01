class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        int maxDifference = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(maxDifference < nums[i+1] - nums[i]){
                maxDifference = nums[i+1] - nums[i];
            }
        }
        return maxDifference;
    }
}
