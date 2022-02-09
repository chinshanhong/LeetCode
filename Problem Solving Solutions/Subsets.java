class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < Math.pow(2, nums.length); i++){
            List<Integer> list = new ArrayList<>();
            String binary = Integer.toBinaryString(i);
            
            while(binary.length() < nums.length){
                binary = '0' + binary;
            }
            
            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '1'){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
}
