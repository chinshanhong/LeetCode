class Solution {
    public int maxPower(String s) {
        
        if(s.length() == 1){
            return 1;
        }
        
        int power = 1;
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                power++;
                if(max < power){
                    max = power;
                }
            }
            else{
                power = 1;
                if(max < power){
                    max = power;
                }
            }
        }
        return max;
    }
}
