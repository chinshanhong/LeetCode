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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        
        for(int i = 1; i < list.size(); i++){
            int currentElement = list.get(i);
            int k;
            
            for(k = i - 1; k >= 0 && list.get(k) > currentElement; k--){
               list.set(k + 1, list.get(k));
            }
            list.set(k + 1, currentElement);
        }
    
        current = head;
        int idx = 0;
        while(current != null){
            current.val = list.get(idx);
            current = current.next;
            idx++;
        }
        
        return head;
    }
}
