class Solution {
    public int[] replaceElements(int[] arr) {
        int greatestElement = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[arr.length-1] = -1;
                break;
            }
            for(int j = i + 1; j < arr.length; j++){
                if(greatestElement < arr[j]){
                    greatestElement = arr[j];
                }
            }
            arr[i] = greatestElement;
            greatestElement = 0;
        }
        return arr;
    }
}
