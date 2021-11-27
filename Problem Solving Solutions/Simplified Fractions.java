class Solution {
    public List<String> simplifiedFractions(int n) {
        ArrayList<String> res = new ArrayList<>();
        HashSet<Double> set = new HashSet<Double>();
        for(int i = 2; i <= n; i++){
            for(int j = 1; j < n; j++){
                if(j < i && !set.contains(j / (double)i)){
                    res.add(j + "/" + i);
                    set.add(j / (double)i);
                }
            }
        }
        
        return res;
    }
}
