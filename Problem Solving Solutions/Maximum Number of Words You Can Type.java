import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] temp = text.split(" ");
        int res = 0;
        for(int i = 0; i < temp.length; i++){
            if(brokenLetters.equals("")){
                res = temp.length;
                break;
            }
            Pattern pattern = Pattern.compile("[" + brokenLetters + "]");
            Matcher matcher = pattern.matcher(temp[i]);
            boolean match = matcher.find();
            if(!match){
                res++;
            }
        }
        return res;
    }
}
