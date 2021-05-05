class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("C")){
                stack.pop();
            }
            else if(ops[i].equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if(ops[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a);
                stack.push(b);
                stack.push(a + b);
            }
            else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
