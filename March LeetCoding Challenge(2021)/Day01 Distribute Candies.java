class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueTypes = new HashSet<Integer>();
        int candyNum = candyType.length / 2;
        
        for(int i = 0; i < candyType.length; i++) uniqueTypes.add(candyType[i]);
        if(candyNum <= uniqueTypes.size()) return candyNum;
        return uniqueTypes.size();
    }
}
