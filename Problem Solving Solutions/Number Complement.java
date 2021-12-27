class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        String complement = "";
        int res = 0;
        
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                complement += '0';
            }
            else{
                complement += '1';
            }
        }
        
        res = Integer.parseInt(complement, 2);
        
        return res;
    }
}
