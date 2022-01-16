class Solution {
    public int maxDistToClosest(int[] seats) {
        ArrayList<Integer> indexList = new ArrayList<>();
        
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                indexList.add(i);
            }
        }
        int maxDistance = 0;
        
        for(int i = 0; i < indexList.size() - 1; i++){
            if(maxDistance < (indexList.get(i + 1) - indexList.get(i)) / 2){
                maxDistance = (indexList.get(i + 1) - indexList.get(i)) / 2;
            }
        }
        
        if(indexList.get(0) != 0){
            if(maxDistance <  indexList.get(0) - 0){
                maxDistance =  indexList.get(0) - 0;
            }
        }
        
        if(indexList.get(indexList.size() - 1) != seats.length - 1){
            if(maxDistance <  (seats.length - 1) - indexList.get(indexList.size() - 1)){
                maxDistance =  (seats.length - 1) - indexList.get(indexList.size() - 1);
            }
        }
        
        return maxDistance;
    }
}
