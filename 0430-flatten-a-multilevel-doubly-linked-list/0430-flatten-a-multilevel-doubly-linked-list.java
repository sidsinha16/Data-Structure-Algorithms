/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if(head == null)
            return null;
        
        Node curr = head;
        
        while(curr !=null){
            if(curr.child !=null){
                //flatten
                Node childHead = flatten(curr.child);

                //connect
                Node nextNode = curr.next;
                curr.next = childHead;
                childHead.prev = curr;

                //traverse the tail of child
                Node childTail = childHead;
                while(childTail.next !=null){
                    childTail = childTail.next;
                } 

                //connect tail
                childTail.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = childTail;
                }

                //set child pointer
                curr.child = null;
            }

            //move to next
            curr = curr.next;
        }
        
        return head;
    }
}