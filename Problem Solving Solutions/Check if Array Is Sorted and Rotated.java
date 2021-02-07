class Solution {
    public boolean check(int[] nums) {
        int[] clone = nums.clone();
        boolean sortedAndrotated = true;
        Arrays.sort(clone);
        int x = 0;
        while(x <= nums.length){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != clone[(i+x) % nums.length]){
                    sortedAndrotated = false;
                    x++;
                    break;
                }
                else{
                    sortedAndrotated = true;
                }
            }
            if(sortedAndrotated){
                return true;
            }
        }
        return false;
    }
}
