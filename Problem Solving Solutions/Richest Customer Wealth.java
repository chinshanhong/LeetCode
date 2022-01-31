class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        int sum = 0;
        for(int[] customer : accounts){
            for(int money : customer){
                sum += money;
            }
            richestWealth = Math.max(richestWealth, sum);
            sum = 0;
        }
        return richestWealth;
    }
}
