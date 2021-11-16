class Solution {
    public int totalMoney(int n) {
        int incompleteWeekNum = 0;
        int completeWeekNum = 0;
        int totalMoney = 0;
        
        if(n <= 7){
            incompleteWeekNum = n;
            for(int i = 1; i <= n; i++){
                totalMoney += i;
            }
            return totalMoney;
        }
        else{
            completeWeekNum = (int)(n / 7);
            incompleteWeekNum = n - (completeWeekNum * 7);
            int mondayStartValue = 1;
            
            for(int i = 0; i < completeWeekNum; i++){
                for(int j = mondayStartValue; j <= mondayStartValue + 6; j++){
                    totalMoney += j;
                }
                mondayStartValue++;
            }
            
            for(int i = mondayStartValue; i <= mondayStartValue + (incompleteWeekNum - 1); i++){
                totalMoney += i;
            }
            
            return totalMoney;
        }
        
    }
    
}
