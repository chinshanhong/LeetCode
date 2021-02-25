class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] clone = nums.clone();
        
        Arrays.sort(clone);
        int start = clone.length, end = 0;
        for(int i = 0; i < nums.length; i++){
            if(clone[i] != nums[i]){
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if(end - start >= 0) return end - start + 1;
        else return 0;
    }
}
