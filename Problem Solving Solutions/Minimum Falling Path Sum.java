class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int minVal = Integer.MAX_VALUE;
                if(j - 1 >= 0){
                    minVal = Math.min(minVal, matrix[i - 1][j - 1]);
                }
                if(j + 1 < matrix[0].length){
                    minVal = Math.min(minVal, matrix[i - 1][j + 1]);
                }
                minVal = Math.min(minVal, matrix[i - 1][j]);
                matrix[i][j] += minVal;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < matrix[matrix.length - 1].length; i++){
            res = Math.min(res, matrix[matrix.length - 1][i]);
        }
        return res;
    }
}
