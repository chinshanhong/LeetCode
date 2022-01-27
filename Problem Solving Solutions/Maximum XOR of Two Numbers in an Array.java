class Solution {
    public int findMaximumXOR(int[] nums) {
        
        int max = 0, mask = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 30; i >= 0; i--){
            mask |= (1 << i);
            
            for(int j = 0; j < nums.length; j++){
                set.add(nums[j] & mask);
            }
            
            int newMax = max | (1 << i);
            for(int prefix : set){
                if(set.contains(newMax ^ prefix)){
                    max = newMax;
                    break;
                }
            }
            set.clear();
        }
        return max;
    }
}
