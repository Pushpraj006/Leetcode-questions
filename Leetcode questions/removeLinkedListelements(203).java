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
    public ListNode removeElements(ListNode head, int val) {
       ListNode temp = head;

       // checked whether the value that is to be deleted had not been presente in the first value of the linked list
       while(head != null && head.val == val){
        head = head.next;
       }

       // Now checked the other node position
       while(temp!= null && temp.next !=null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
       return head;
    }
}
