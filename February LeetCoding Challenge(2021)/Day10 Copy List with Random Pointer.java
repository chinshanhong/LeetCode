/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

//Credits to GoodTecher
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        Map<Node, Node> map = new HashMap<>();
        Node dummy = new Node(0);
        Node current = dummy;
        Node newNode = null;
        
        while(head != null){
            if(map.containsKey(head)){
                newNode = map.get(head);
            }
            else{
                newNode = new Node(head.val);
                map.put(head, newNode);
            }
            if(head.random != null){
                if(map.containsKey(head.random)){
                    newNode.random = map.get(head.random);
                }
                else{
                    newNode.random = new Node(head.random.val);
                    map.put(head.random, newNode.random);
                }
            }
            current.next = newNode;
            current = newNode;
            head = head.next;
        }
        return dummy.next;
    }
}
