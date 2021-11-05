class Solution {
    public int arrangeCoins(int n) {
        int numOfRow = 0;
        int elementRequired = 1;
        while(true){
            if(n - elementRequired >= 0){
                n -= elementRequired;
                numOfRow++;
            }
            else{
                return numOfRow;
            }
            elementRequired++;
        }
    }
}
