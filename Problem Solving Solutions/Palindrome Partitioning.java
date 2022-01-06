class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        Deque<String> currPart = new LinkedList<>();
        findPartition(res, currPart, 0, s.length(), s);
        return res;
    }
    
    public static void findPartition(List<List<String>> res, Deque<String> currPart, int start, int n, String s){
        if(start >= n){
            res.add(new ArrayList<>(currPart));
            return;
        }
        
        for(int i = start; i < n; i++){
            if(isPalindrome(s, start, i)){
                currPart.addLast(s.substring(start, i + 1));
                findPartition(res, currPart, i + 1, n, s);
                currPart.removeLast();
            }
        }
    }
    
    public static boolean isPalindrome(String s, int start, int i){
        while(start < i){
            if(s.charAt(start++) != s.charAt(i--)){
                return false;
            }
        }
        return true;
    }
}
