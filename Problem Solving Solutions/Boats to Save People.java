class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1 = 0, p2 = people.length - 1;
        int ans = 0;
        
        while(p1 <= p2){
            ans++;
            if(people[p1] + people[p2] <= limit){
                p1++;  
            }
            p2--;
        }
        return ans;
    }
}
