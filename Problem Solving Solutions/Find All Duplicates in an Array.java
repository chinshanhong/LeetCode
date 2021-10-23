class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
             map.put(nums[i], 0);
        }
        for(int i = 0; i < nums.length; i++){
            map.replace(nums[i], map.get(nums[i]) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) == 2){
                list.add(i);
            }
        }
        return list;
    }
}
