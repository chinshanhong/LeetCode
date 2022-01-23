class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list =  new ArrayList<>();
        String s = "123456789";
        int lowLength = (low + "").length();
        int highLength = (high + "").length();
        
        stop: for(int i = lowLength; i <= highLength; i++){
            for(int j = 0; j <= (s.length() - i); j++){
                int val = Integer.parseInt(s.substring(j, i + j));
                if(val > high){
                    break stop;
                }
                else if(val >= low && val <= high){
                    list.add(val);
                }
            }
        }
        return list;
    }
}
