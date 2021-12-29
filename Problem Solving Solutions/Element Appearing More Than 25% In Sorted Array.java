class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        else{
            int[] occ = new int[arr[arr.length - 1] + 1];
            
            for(int i = 0; i < arr.length; i++){
                occ[arr[i]]++;
            }
            
            for(int i = 0; i < occ.length; i++){
                if((double)occ[i] / arr.length > 0.25){
                    return i;
                }
            }
        }
        return 0;
    }
}
