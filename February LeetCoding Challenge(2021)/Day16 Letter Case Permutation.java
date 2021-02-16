//Credits goes to codebix

class Solution {
    public List<String> letterCasePermutation(String S) {
        
        List<String> res = new ArrayList<>();
        
        findAllPermutations(res, S, 0);
        return res;
    }
    
    public static void findAllPermutations(List<String> res, String word, int start){
        
        res.add(word);
        for(int i = start; i < word.length(); i++){
            char[] wordArray = word.toCharArray();
            if(Character.isLetter(word.charAt(i))){
                if(Character.isUpperCase(word.charAt(i))){
                    wordArray[i] = Character.toLowerCase(word.charAt(i));
                    findAllPermutations(res, String.valueOf(wordArray), i+1);
                }
                else{
                    wordArray[i] = Character.toUpperCase(word.charAt(i));
                    findAllPermutations(res, String.valueOf(wordArray), i+1);
                }
            }
        }
    }
}
