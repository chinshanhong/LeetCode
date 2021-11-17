class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                countA++;
            }
        }
        if(countA >= 2 || s.contains("LLL")){
            return false;
        }
        return true;  
    }
}
