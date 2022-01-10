class Solution {
    public int sumOfUnique(int[] nums) {
        int[] occ = new int[100];
        for(int i = 0; i < nums.length; i++){
            occ[nums[i] - 1]++;
        }
        
        int res = 0;
        
        for(int i = 0; i < occ.length; i++){
            if(occ[i] == 1){
                res += i + 1;
            }
        }
        return res;
    }
}
