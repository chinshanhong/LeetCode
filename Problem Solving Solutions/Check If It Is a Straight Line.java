class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dxl = coordinates[coordinates.length - 1][0] - coordinates[0][0];
        int dyl = coordinates[coordinates.length - 1][1] - coordinates[0][1];
        
        for(int i = 1; i < coordinates.length - 1; i++){
            int dxc = coordinates[i][0] - coordinates[0][0];
            int dyc = coordinates[i][1] - coordinates[0][1];
            
            if(dxc * dyl - dyc * dxl != 0){
                return false;
            }
        }
        return true;
    }
}
