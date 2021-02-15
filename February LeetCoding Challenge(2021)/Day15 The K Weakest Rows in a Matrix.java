class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int soldierCount = 0;
        int[] soldiers = new int[mat.length];
        int[] indexes = new int[mat.length];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                soldierCount += mat[i][j];
            }
            soldiers[i] = soldierCount;
            indexes[i] = i;
            soldierCount = 0;
        }
        
        for(int pass = 0; pass < soldiers.length; pass++){
            for(int i = 0; i < soldiers.length-1; i++){
                if(soldiers[i] > soldiers[i+1]){
                    int temp1 = soldiers[i];
                    soldiers[i] = soldiers[i+1];
                    soldiers[i+1] = temp1;
                    int temp2 = indexes[i];
                    indexes[i] = indexes[i+1];
                    indexes[i+1] = temp2;
                }
            }
        }
        
        return Arrays.copyOfRange(indexes, 0, k);
    }
}
