class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outDegree = new int[n];
        int[] inDegree = new int[n];
        for(int[] i : trust){
            outDegree[i[0] - 1]++;
            inDegree[i[1] - 1]++;
        }
        int res = -1;
        for(int i = 0; i < outDegree.length; i++){
            if(inDegree[i] - outDegree[i] == n - 1){
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
