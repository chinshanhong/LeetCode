class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        
        if(flowerbed.length == 1){
            if(flowerbed[0] == 1){
                return false;
            }
            else if(flowerbed[0] == 0 && n > 1){
                return false;
            }
        }
        
        for(int i = 0; i < flowerbed.length; i++){
            if(n == 0){
                break;
            }
            
            if(flowerbed[i] == 1){
                continue;
            }
            else{
                if((i - 1 >= 0 && flowerbed[i - 1] == 1) || 
                  (i + 1 < flowerbed.length && flowerbed[i + 1] == 1)){
                    continue;
                }
                else{
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
