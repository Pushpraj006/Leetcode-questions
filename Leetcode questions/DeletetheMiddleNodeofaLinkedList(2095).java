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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int size = 0;
        if(head == null || head.next == null){
            return null;
        }
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        int befmiddindex = size/2;
        int i  = 0;
        temp = head;
        while(i < size/2-1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
    }
}
