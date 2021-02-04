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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> original  = new ArrayList<Integer>();
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        while(head!=null){
            original.add(head.val);
            head = head.next;
        }
        reverse = (ArrayList)original.clone();
        Collections.reverse(reverse);
        if(original.equals(reverse)){
            return true;
        }
        return false;
    }
}
