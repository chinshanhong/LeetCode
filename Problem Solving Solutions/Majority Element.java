class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
        }
        int res = 0;
        for(int i : map.keySet()){
            if(map.get(i) > nums.length / 2){
                res = i;
            }
        }
        return res;
    }
}
