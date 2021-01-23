class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int index = 0;
        for(int i = 0; i < nums1.length; i++){
            nums3[index] = nums1[i];
            index++;
        }
        for(int i = 0; i < nums2.length; i++){
            nums3[index] = nums2[i];
            index++;
        }
        Arrays.sort(nums3);
        if(nums3.length % 2 == 0){
            return ((double)nums3[nums3.length/2] + (double)nums3[nums3.length/2 -1])/2;
        }
        else{
            return nums3[nums3.length/2];
        }
    }
}
