class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<String>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= s.length() - 10; i++){
            if(set.contains(s.substring(i, i + 10)) 
               && !list.contains(s.substring(i, i + 10))){
                list.add(s.substring(i, i + 10));
            }
            else{
                set.add(s.substring(i, i + 10));
            }
        }
        return list;
    }
}
