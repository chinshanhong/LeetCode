class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        
        if(nums[nums.length - 1] != nums.length){
            return res = nums.length;
        }
        else{
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i + 1] - nums[i] > 1) res = nums[i] + 1;
            }
             return res;
        }
    }
}
