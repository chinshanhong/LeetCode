class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] occ = new int[nums.length + 1];
        
        occ[0]++;
        
        for(int i = 0; i < nums.length; i++) occ[nums[i]]++;
        for(int i = 0; i < occ.length; i++){
            if(occ[i] == 2) res[0] = i;
            else if(occ[i] == 0) res[1] = i;
        }
        return res;
    }
}
