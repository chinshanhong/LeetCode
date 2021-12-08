class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        int resLength = 0;
        String[] words = text.split(" ");
        
        for(int i = 0; i < words.length-2; i++){
            if(words[i].equals(first) && words[i + 1].equals(second)){
                resLength++;
            }
        }
        
        String[] res = new String[resLength];
        int index = 0;
        
        for(int i = 0; i < words.length-2; i++){
            if(words[i].equals(first) && words[i + 1].equals(second)){
                res[index] = words[i + 2];
                index++;
            }
        }
        
        return res;
    }
}
