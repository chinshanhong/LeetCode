class Solution {
    public int thirdMax(int[] nums) {
  
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++){
            if(!list.contains(nums[j])) list.add(nums[j]);
        }
        if(list.size() < 3) return Collections.max(list);
        return list.get(list.size() - 3);

    }
}
