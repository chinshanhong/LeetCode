class Solution {
    public int removePalindromeSub(String s) {
        if(s.equals("")) return 0;
        if((isPalindrome(s))) return 1;
        else{
            return 2;
        }
    }
    public boolean isPalindrome(String s){
        String temp = "";
        for(int i = s.length() - 1; i >= 0; i--){
            temp += s.charAt(i);
        }
        if(temp.equals(s)) return true;
        return false;
    }
}
