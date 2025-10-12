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
    public ListNode middleNode(ListNode head) {
        // calculate the size of the linked list 
        ListNode temp = head;
        int size = 0;

        while(temp!=null){
            temp =  temp.next;
            size++;
        }

        int midindex = size/2;
        temp = head;
        for(int count = 0; count<midindex; count++){
            temp = temp.next;
        }
        return temp;
    }
}
