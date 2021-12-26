class Solution {
    public boolean checkZeroOnes(String s) {
        if(!s.contains("0")){
            return true;
        }
        else if(!s.contains("1")){
            return false;
        }
        
        int max1 = 0;
        int max0 = 0;
        int count1 = 0;
        int count0 = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count1++;
                count0 = 0;
            }
            else{
                count0++;
                count1 = 0;
            }
            if(max0 < count0){
                max0 = count0;
            }
             if(max1 < count1){
                max1 = count1;
            }
        }
        return max1 > max0;
    }
}
