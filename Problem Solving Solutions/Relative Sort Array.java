class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr2.length; i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i], i);
            }
        }
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length - 1; j++){
                if(map.containsKey(arr1[j]) && map.containsKey(arr1[j + 1])){
                    if(map.get(arr1[j]) > map.get(arr1[j + 1])){
                        int temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                    }
                }
                else if(!map.containsKey(arr1[j]) && map.containsKey(arr1[j + 1])){
                        int temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                }
                else if(!map.containsKey(arr1[j]) && !map.containsKey(arr1[j + 1])){
                    if(arr1[j] > arr1[j + 1]){
                        int temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                    }
                }
            }
        }
        return arr1;
    }
}
