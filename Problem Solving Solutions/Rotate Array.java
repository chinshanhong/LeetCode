class Solution {
    public void rotate(int[] nums, int k) {
        //Failed last test case, time limit exceeded
        /*while(k > 0){
            int last = nums[nums.length - 1];
            for(int i = nums.length - 1; i > 0; i--){
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            k--;
        }*/
        int n = nums.length;
        if(k > n){
            k = k % n;
        }
        nums = reverse(nums, 0, n - 1);
        nums = reverse(nums, 0, k - 1);
        nums = reverse(nums, k, n - 1);
    }
    
    public static int[] reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
