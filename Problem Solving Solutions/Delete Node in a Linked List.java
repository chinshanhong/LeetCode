/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node != null){
            if(node.next.next == null){
                node.val = node.next.val;
                node.next = null;
                break;
            }
            int tempVal = node.val;
            node.val = node.next.val;
            node.next.val = tempVal;
            node = node.next;
        }
    }
}
