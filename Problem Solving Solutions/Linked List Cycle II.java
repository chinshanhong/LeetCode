/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode fast = hasCycle(head);
        
        if(fast == null){
            return null;
        }
        
        ListNode slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
    
    public static ListNode hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
            
            if(slow != null){
                slow = slow.next;
            }
            
            if(slow == fast){
                break;
            }
        }
        
        return fast;
    }
}
