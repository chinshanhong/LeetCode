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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ListNode list = null;
        while(head != null){
            array.add(head.val);
            head = head.next;
        }
        Collections.sort(array);
        for(int i = array.size()-1; i >= 0; i--){
            list = new ListNode(array.get(i), list);
                
        }
        return list;
    }
}
