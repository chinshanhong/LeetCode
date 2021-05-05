class Solution {
    public boolean isValid(String s) {
        String[] brackets = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < brackets.length; i++){
            if(brackets[i].equals("(") || brackets[i].equals("{") || brackets[i].equals("[")){
                stack.push(brackets[i]);
            }
            else if(brackets[i].equals(")")){
                if(!stack.isEmpty() && stack.peek().equals("(")){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(brackets[i].equals("}")){
                if(!stack.isEmpty() && stack.peek().equals("{")){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(brackets[i].equals("]")){
                if(!stack.isEmpty() && stack.peek().equals("[")){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
