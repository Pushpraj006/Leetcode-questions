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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // find size of the linked list 
        ListNode temp = head;
        int size  = 0;
        while(temp!= null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return head;
        }

        ListNode prev = head;
        int prevNo = size - n;
        int i = 1;
        while(i< prevNo){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return head;
    }
}
