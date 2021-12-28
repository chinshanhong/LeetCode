class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] row : matrix){
            if(target >= row[0] && target <= row[row.length - 1]){
                for(int i : row){
                    if(i == target){
                        return true;
                    }
                }
            }
            else if(target > row[row.length - 1]){
                continue;
            }
        }
        return false;
    }
}
