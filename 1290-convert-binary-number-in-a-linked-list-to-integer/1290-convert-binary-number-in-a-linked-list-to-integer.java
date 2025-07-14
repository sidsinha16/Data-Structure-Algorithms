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
    public int getDecimalValue(ListNode head) {
        
        int decimalVal = 0;
        ListNode node = head;

        while(node != null){
            decimalVal = decimalVal*2 + node.val;
            node = node.next; 
        }

        return decimalVal;
    }

    public int getPow(int i, int j){
        if(j == 0){
            return 1;
        }
        return i*getPow(i, j-1);
    }
}