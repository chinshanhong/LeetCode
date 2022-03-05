class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1 || nums.length == 2 || nums[0] == nums[nums.length - 1]){
            return 0;
        }
        int min = nums[0];
        int max = nums[nums.length - 1];
        int res = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            if(min == nums[i]){
                res--;
            }
            else{
                break;
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(max == nums[i]){
                res--;
            }
            else{
                break;
            }
        }
        return res;
    }
}
