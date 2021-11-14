class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r * c != mat.length * mat[0].length){
            return mat;
        }
        else{
            int row_idx = 0;
            int col_idx = 0;
            int[][] res = new int[r][c];
            for(int i = 0; i < res.length; i++){
                for(int j = 0; j < res[i].length; j++){
                    if(col_idx == mat[row_idx].length){
                        row_idx++;
                        col_idx = 0;
                    }
                    res[i][j] = mat[row_idx][col_idx++];
                }
            }
            return res;
        }
    }
}
