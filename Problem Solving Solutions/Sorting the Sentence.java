class Solution {
    public String sortSentence(String s) {
        String[] temp = s.split(" ");
        
        String[] sorted = new String[temp.length];
        
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i].charAt(temp[i].length() - 1) - '1');
            sorted[temp[i].charAt(temp[i].length() - 1) - '1']
                = temp[i].substring(0, temp[i].length() - 1);
        }
        
        String res = sorted[0];
        for(int i = 1; i < sorted.length; i++){
            res += " " + sorted[i];
        }
        
        return res;
    }
}
