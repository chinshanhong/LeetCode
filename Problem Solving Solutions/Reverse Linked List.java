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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        if(list.isEmpty()) return null;
        else if(list.size() == 1){
            ListNode node = new ListNode(list.get(0));
            return node;
        }
        
        ListNode newHead = new ListNode(list.get(list.size() - 1));
        ListNode res = newHead;
        
        for(int i = list.size() - 2; i >= 0; i--){
            ListNode newNode = new ListNode(list.get(i));
            res.next = newNode;
            res = res.next;
        }
        
        res = newHead;
        return res;
    }
}
