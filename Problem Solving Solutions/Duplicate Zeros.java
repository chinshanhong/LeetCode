class Solution {
    public void duplicateZeros(int[] arr) {
        int oddZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                oddZero++;
                if(oddZero % 2 != 0){
                    for(int j = arr.length-2; j >= i; j--){
                        arr[j+1] = arr[j];
                    }
                }
            }
        }
    }
}
