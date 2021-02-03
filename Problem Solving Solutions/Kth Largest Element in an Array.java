class Solution {
    public int findKthLargest(int[] nums, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            stack.push(nums[i]);
        }
        int result = 0;
        while(k > 0){
            result = stack.pop();
            k--;
        }
        return result;
    }
}
