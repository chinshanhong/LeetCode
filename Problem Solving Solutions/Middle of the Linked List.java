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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int size = 0;
        
        while(current != null){
            size++;
            current = current.next;
        }
        
        if(size % 2 != 0){
            int loopNum = (size / 2);
            current = head;
            while(loopNum > 0){
                current = current.next;
                loopNum--;
            }
        }
        else{
            int loopNum = (size / 2);
            current = head;
            while(loopNum > 0){
                current = current.next;
                loopNum--;
            }
        }
        return current;
    }
}
