class Solution {
    public int[] sortArrayByParity(int[] A) {
        for(int pass = 0 ; pass < A.length; pass++){
            for(int i = 0; i < A.length-1; i++){
                if(A[i] % 2 == 1 && A[i+1] % 2 == 0){
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
        return A;
    }
}
