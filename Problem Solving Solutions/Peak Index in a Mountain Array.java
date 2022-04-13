class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mid - 1 >= 0 && mid + 1 < arr.length){
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
                    low = mid;
                }
                if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    high = mid;
                }
            }
        }
        return 0;
    }
}
