class Solution {
    public int maxArea(int[] height) {
         int maxHeight = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(j == i){
                    continue;
                }
                if(height[i] < height[j]){
                    if(maxHeight < (height[i] * (j-i))){
                        maxHeight = height[i] * (j-i);
                        
                    }
                }
                else if(height[j] < height[i]){
                    if(maxHeight < (height[j] * (j-i))){
                        maxHeight = height[j] * (j-i);
                    }
                }
                else{
                    if(maxHeight < height[i] * (j-i)){
                        maxHeight = height[i] * (j-i);
                    }
                }
            }
        }
        return maxHeight;
    }
}
