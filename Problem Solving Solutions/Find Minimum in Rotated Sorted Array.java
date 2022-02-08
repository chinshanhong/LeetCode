
// O(n) solution
/*class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int countRotated = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] - nums[i + 1] > 0){
                break;
            }
            countRotated++;
        }
        
        if(countRotated == nums.length){
            return nums[0];
        }
        
        int min1 = Arrays.copyOfRange(nums, 0, countRotated)[0];
        int min2 = Arrays.copyOfRange(nums, countRotated, nums.length)[0];
        
        return Math.min(min1, min2);
    }
}*/

// O(log n) solution
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums[0] < nums[nums.length - 1]){
            return nums[0];
        }
        else{
            int low = 0;
            int high = nums.length - 1;
            
            while(low <= high){
                int mid = (low + high) / 2;
                if(nums[mid] > nums[mid + 1]){
                    return nums[mid + 1];
                }
                if(nums[mid - 1] > nums[mid]){
                    return nums[mid];
                }
                if(nums[mid] > nums[0]){
                    low = mid + 1;
                }
                else if(nums[mid] < nums[0]){
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}
