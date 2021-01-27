class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitNum = 0;
        for(int i = 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            if(s.length() % 2 == 0){
                evenDigitNum++;
            }
        }
        return evenDigitNum;
    }
}
