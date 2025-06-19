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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        if(head.next == null || k == 0) {
            return head;
        }
        
        ListNode curr = head;
        int len = 1;

        while(curr !=null && curr.next != null){
            curr = curr.next;
            len++;
        }

        curr.next = head;
        k = k % len;
        if (k == 0) {
            curr.next = null; // break circular link
            return head;
        }

        int stepsToNewTail = len - k;
        ListNode newTail = head;
        while (stepsToNewTail-- > 1) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        curr.next = head; // complete the rotation

        return newHead;

    }
}