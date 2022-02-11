class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j - 1 >= 0 && j < pascal.size()){
                    int a = pascal.get(pascal.size() - 1).get(j);
                    int b = pascal.get(pascal.size() - 1).get(j - 1);
                    row.add(a + b);
                }
                else{
                    row.add(1);
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
