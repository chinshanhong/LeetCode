class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                set.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        if(set.size() <= 1){
            return -1;
        }
        else{
            int max = 0;
            for(int i : set){
                if(max < i){
                max = i;
                }
            }
            int res = 0;
            for (int i : set){
                if(res < i && i != max){
                    res = i;
                }
            }
            return res;
        }
    }
}
