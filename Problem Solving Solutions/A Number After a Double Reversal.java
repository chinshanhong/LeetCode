class Solution {
    //A less efficient solution
    public boolean isSameAfterReversals(int num) {
        String input = num + "";
        if(input.length() == 1) return true;
        String reverse1 = reverse(input);
        String reverse2 = reverse(reverse1);
        return reverse2.equals(input);

    }
    
    public static String reverse(String input){
        String res = "";
        if(input.charAt(input.length() - 1) != '0'){
            for(int i = input.length() - 1; i >= 0; i--){
                res += input.charAt(i);
            }
        }
        else{
            int stopIdx = input.length() - 1;
            for(int i = input.length() - 1; i >= 0; i--){
                if(input.charAt(i) != '0'){
                    stopIdx = i;
                    break;
                }
                else{
                    stopIdx--;
                }
            }
            for(int i = stopIdx; i >= 0; i--){
                res += input.charAt(i);
            }
        }
        return res;
    }
    
    //A more effective solution
    public boolean isSameAfterReversals(int num) {
         if(num == 0){
            return true;
        }
        if(num % 10 != 0) return true;
        else return false;
    }
}
