/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ArrayList<Integer> list;
    public Solution(ListNode head) {
        list = new ArrayList<>();
        ListNode current = head;
        
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
    }
    
    public int getRandom() {
        Random random = new Random();
        int idx = random.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
