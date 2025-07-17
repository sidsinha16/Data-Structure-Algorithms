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
        
        if(head == null) return head;
        if(k==0) return head;

        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k%length;
        if(k == 0 ){ return head; } // no rotation required

        // new Tail
        ListNode newTail = head;
        int stepstoBreak = length-k-1;
        for(int i=0; i<stepstoBreak;i++){
            newTail = newTail.next;
        }


        //rotate
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;

    }
}