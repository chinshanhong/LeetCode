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
    public int getDecimalValue(ListNode head) {
        String a = Integer.toString(head.val);
        while(head.next != null){
            head = head.next;
            a += head.val;
        }
        int b= Integer.parseInt(a, 2);
        return b;
    }
}
