class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long squareMid = mid * mid;
            if(squareMid == num){
                return true;
            }
            else if(squareMid > num){
                end = (int) mid - 1;
            }
            else if(squareMid < num){
                start = (int) mid + 1;
            }
        }
        return false;
    }
}
