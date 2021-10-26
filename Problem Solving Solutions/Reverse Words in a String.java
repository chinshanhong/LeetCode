class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().replaceAll("\\s+", " ").split(" ");
        String res = "";
        for(int i = temp.length - 1; i >= 0; i--){
            if(i > 0){
                res += temp[i] + " ";
            }
            else{
                res += temp[i];
            }
        }
        return res;
    }
}
