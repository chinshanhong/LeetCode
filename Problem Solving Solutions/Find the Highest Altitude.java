class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int max = start;
        gain[0] += start;
        
        if(gain[0] > max) max = gain[0];
        for(int i = 1; i < gain.length; i++){
            gain[i] += gain[i - 1];
            if(gain[i] > max) max = gain[i];
        }
        return max;
    }
}
