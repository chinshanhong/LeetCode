class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Stack<String> stk = new Stack<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = s.length()-1; i >= 0; i--){
            stk.push(Character.toString(s.charAt(i)));
        }
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        
        while(!stk.empty()){
            String a = "";
            if(!stk.empty()) a = stk.pop();
            if(!stk.empty() && map.containsKey(a + stk.peek())) res += map.get(a + stk.pop());
            else res += map.get(a);
            a = "";
        }
        return res;
    }
}
