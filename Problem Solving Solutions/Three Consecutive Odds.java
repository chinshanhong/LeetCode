class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean res = false;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                count++;
            }
            else{
                count = 0;
            }
            if(count == 3){
                res = true;
                break;
            }
        }
        return res;
    }
}
