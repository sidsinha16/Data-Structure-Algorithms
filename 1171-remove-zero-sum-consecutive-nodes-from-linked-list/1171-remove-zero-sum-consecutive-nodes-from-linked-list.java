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
    ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> prefixMap = new HashMap<>();
        int prefixSum = 0;
        ListNode curr = dummy;

        // First pass: record the last occurrence of each prefix sum
        while (curr != null) {
            prefixSum += curr.val;
            prefixMap.put(prefixSum, curr);
            curr = curr.next;
        }

        // Second pass: remove zero-sum sequences
        prefixSum = 0;
        curr = dummy;
        while (curr != null) {
            prefixSum += curr.val;
            curr.next = prefixMap.get(prefixSum).next;
            curr = curr.next;
        }

        return dummy.next;
    }
}