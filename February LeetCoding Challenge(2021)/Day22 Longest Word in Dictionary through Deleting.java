//Credits goes to wenchao guo
class Solution {
    public String findLongestWord(String s, List<String> d) {
        TreeMap<Integer, List<String>> map = new TreeMap<>((o1, o2) -> (o2 - o1));
        
        for(String str : d){
            int len = str.length();
            map.putIfAbsent(len, new ArrayList<>());
            map.get(len).add(str);
        }
        
        Iterator<Integer> it = map.keySet().iterator();
         List<String> candidates = new ArrayList<>();
        while(it.hasNext()){
            Integer len = it.next();
            List<String> strings = map.get(len);
            for(String str : strings){
                if(isSubsequence(s, str)){
                    candidates.add(str);
                }
            }
            if(candidates.size() > 0){
                break;
            }
        }
        
        if(candidates.size() == 0) return "";
        Collections.sort(candidates);
        return candidates.get(0);
    }
    
    public static boolean isSubsequence(String a, String b){
        int i = 0, j = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)) j++;
            i++;
        }
        return j == b.length();
    }
}
