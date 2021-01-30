class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] dayNum = new int[T.length];
        for(int i = 0; i < T.length-1; i++){
            for(int j = i+1; j < T.length; j++){
                if(T[j] > T[i]){
                    dayNum[i]= j - i;
                    break;
                }
            }
                
        }
        return dayNum;
    }
}
