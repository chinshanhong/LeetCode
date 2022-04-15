class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        if(nums1.length >= nums2.length){
            findIntersection(list, nums1, nums2);
        }
        else{
            findIntersection(list, nums2, nums1);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void findIntersection(ArrayList<Integer> list,
                                                     int[] arr1,
                                                     int[] arr2){
        int p1 = 0;
        int p2 = 0;
        
        while(p1 < arr1.length && p2 < arr2.length){
            if(arr2[p2] == arr1[p1]){
                list.add(arr2[p2]);
                p2++;
                p1++;
            }
            else if(arr2[p2] < arr1[p1]){
                p2++;
            }
            else if(arr1[p1] < arr2[p2]){
                p1++;
            }
        }
    }
}
