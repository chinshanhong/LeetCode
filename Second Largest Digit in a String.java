class Solution {
    public int secondHighest(String s) {
        int secondMax = -1;
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                if(max < (s.charAt(i) - 48)){
                    max = s.charAt(i) - 48;
                }
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                if(secondMax < (s.charAt(i) - 48) && max != (s.charAt(i) - 48)){
                    secondMax = s.charAt(i) - 48;
                }
            }
        }
        
        if(secondMax == max){
            return -1;
        }
        return secondMax;
    }
}
