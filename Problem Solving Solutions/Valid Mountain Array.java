class Solution {
    public boolean validMountainArray(int[] arr) {
       if (arr == null || arr.length < 3) return false;
        
        boolean increasing = arr[1] > arr[0];
        if (!increasing) return false; // the mountain must at least start in an increasing manner
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) return false; //plateaus are prohibited
            if (increasing) {
                if (arr[i] < arr[i-1]) increasing = false; // we reached the peak
            } else { // every element must be decreasing, otherwise return false
                if (arr[i] > arr[i-1]) return false;
            }
        }
        return !increasing;
        
        // we can't just return true, we must ensure that a peak
    }
}
