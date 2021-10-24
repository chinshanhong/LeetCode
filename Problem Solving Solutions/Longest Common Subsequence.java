class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] lcsTable = new int[m + 1][n + 1];
        
        int maxLength = 0;
        int maxRow = 0;
        int maxColumn = 0;
        
        // init first row with 0
        for(int i = 0; i < m; i++){
            lcsTable[i][0] = 0;
        }
        
        // init first col with 0
        for(int j = 0; j < n; j++){
            lcsTable[0][j] = 0;
        }
        
        //starting from 1 as row 0 and col 0 filled with 0
        // string length
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    lcsTable[i][j] = 1 + lcsTable[i - 1][j - 1];
                    if(maxLength <= lcsTable[i][j]){
                        maxLength = lcsTable[i][j];
                        maxRow = i;
                        maxColumn = j;
                    }
                }
                else{
                    lcsTable[i][j] = Math.max(lcsTable[i - 1][j], lcsTable[i][j - 1]);
                }
            }
        }
        String res = "";
        while(maxRow >= 1 && maxColumn >= 1){
            if(text1.charAt(maxRow - 1) == text2.charAt(maxColumn - 1)){
                res += text1.charAt(maxRow - 1);
                maxRow--;
                maxColumn--;
            }
            else{
                if(lcsTable[maxRow - 1][maxColumn] >= lcsTable[maxRow][maxColumn - 1]){
                    maxRow--;
                }
                else{
                    maxColumn--;
                }
            }
        }
        return res.length();
    }
}
