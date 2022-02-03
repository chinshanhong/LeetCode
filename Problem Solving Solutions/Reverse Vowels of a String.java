class Solution {
    public String reverseVowels(String s) {
        int p1 = 0; 
        int p2 = s.length() - 1;
        
        while(p1 < p2){
            
            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);
            
            if(isVowel(c1) && isVowel(c2)){
                s = s.substring(0, p1) + c2 + s.substring(p1 + 1);
                s = s.substring(0, p2) + c1 + s.substring(p2 + 1);
                p1++;
                p2--;
            }
            else if(!(isVowel(c1)) && isVowel(c2)){
                p1++;
            }
            else if(isVowel(c1) && !isVowel(c2)){
                p2--;
            }
            else{
                p1++;
                p2--;
            }
        }
        
        return s;
    }
    
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
          || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
