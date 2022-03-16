class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int idx = 0;
        
        for(int i = 0; i < pushed.length; i++){
            s.push(pushed[i]);
            while(idx < popped.length 
                  && !s.empty() 
                  && popped[idx] == s.peek()){
                s.pop();
                idx++;
            }
        }
        return idx == popped.length;
    }
}
