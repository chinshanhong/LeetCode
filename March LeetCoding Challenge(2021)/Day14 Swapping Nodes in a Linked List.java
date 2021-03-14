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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        int temp = list.get(k - 1);
        list.set(k - 1, list.get(list.size() - k));
        list.set(list.size() - k, temp);
        int firstValue = list.get(0);
        
        ListNode newHead = new ListNode(firstValue);
        ListNode res = newHead;
        
        for(int i = 1; i < list.size(); i++){
            res.next = new ListNode(list.get(i));
            res = res.next;
        }
        
        res = newHead;
        return res;
    }
}
