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

        ListNode start = head;
        for(int i=1; i<k; i++){
            start = start.next;
        }
        ListNode kthFromStart = start;
        ListNode last = head;
        while(start.next != null){
            start = start.next;
            last = last.next;
        }
        
        int temp = kthFromStart.val;
        kthFromStart.val = last.val;
        last.val = temp;

        return head; 
    }
}