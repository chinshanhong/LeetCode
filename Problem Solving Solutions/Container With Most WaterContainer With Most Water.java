class Solution {
    public int maxArea(int[] height) {
        int[] area = new int[height.length];
        int max = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(i == j){
                    continue;
                }
                if(height[i] > height[j]){
                    if(max < (height[j] * (j-i))){
                        max = height[j] * (j-i);
                    }
                }
                else if(height[i] < height[j]){
                     if(max < (height[i] * (j-i))){
                        max = height[i] * (j-i);
                    }
                }
                else{
                    if(max < (height[i] * (j-i))){
                        max = height[i] * (j-i);
                    }
                }
            }
            area[i] = max;
        }
        System.out.println(Arrays.toString(area));
        Arrays.sort(area);
        return area[area.length-1];
    }
}
