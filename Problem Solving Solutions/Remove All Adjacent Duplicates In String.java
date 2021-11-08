class Solution {
    public String removeDuplicates(String s) {
        if(s.length() <= 1){
            return s;
        }
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty()){
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        String res = "";
        while(!stack.isEmpty()){
            res = stack.pop() + res;
        }
        
        return res;
    }
}
