class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), 0);
        }
        for(int i = 0; i < s.length(); i++){
            map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for(char i : map.keySet()){
            list.add(i);
        }
        ArrayList<Integer> occ = new ArrayList<>();
        for(int i : map.values()){
            occ.add(i);
        }
        for(int i = 0; i < occ.size(); i++){
            for(int j = 0; j < occ.size() - 1; j++){
                if(occ.get(j) < occ.get(j + 1)){
                    int temp1 = occ.get(j);
                    occ.set(j, occ.get(j + 1));
                    occ.set(j + 1, temp1);
                    char temp2 = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp2);
                }
            }
        }
        String res = "";
        for(int i = 0; i < occ.size(); i++){
            for(int j = 0; j < occ.get(i); j++){
                res += list.get(i);
            }
        }
        return res;
    }
}
