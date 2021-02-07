class Solution {
    public int[] shortestToChar(String s, char c) {
        int minDistance = Integer.MAX_VALUE;
        int temp = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] result = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) array.add(i);
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != c){
                for(int j = 0; j < array.size(); j++){
                    temp = Math.abs(array.get(j) - i);
                    if(temp < minDistance) minDistance = temp;
                }
                result[i] = minDistance;
                minDistance = Integer.MAX_VALUE;
                temp = 0;
            }
            else{
                result[i] = 0;
            }
        }
        return result;
    }
}
