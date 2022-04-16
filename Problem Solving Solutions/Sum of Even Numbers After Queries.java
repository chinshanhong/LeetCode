class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                val += nums[i];
            }
        }
        for(int i = 0; i < queries.length; i++){
            int index = queries[i][1];
            int currentVal = queries[i][0];
            
            if(nums[index] % 2 == 0 && (nums[index] + currentVal) % 2 == 0){
                val += currentVal;
            }
            else if(nums[index] % 2 != 0 && (nums[index] + currentVal) % 2 == 0){
                val += (nums[index] + currentVal);
            }
            else if(nums[index] % 2 == 0 && (nums[index] + currentVal) % 2 != 0){
                val -= nums[index];
            }
            nums[index] += currentVal;
            ans[i] = val;
        }
        return ans;
    }
}
