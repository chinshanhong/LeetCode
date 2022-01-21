class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
        }
        
        if(total < 0){
            return -1;
        }
        else{
            int starting = 0, tank = 0;
            
            for(int i = 0; i < gas.length; i++){
                tank += gas[i] - cost[i];
                if(tank < 0){
                    starting = i + 
                    tank = 0;
                }
            }
            return starting;
        }
    }
}
