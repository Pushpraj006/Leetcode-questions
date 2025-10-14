/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return ;
        }

        // stored next node value in the prev one and point it to the next to next node that's it
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
