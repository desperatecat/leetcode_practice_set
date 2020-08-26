//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC203%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E7%A7%BB%E9%99%A4%E9%93%BE%E8%A1%A8%E5%85%83%E7%B4%A0.md

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = dummyHead;

        while(curr.next != null){
            if(curr.next.val == val) {
                curr.next = curr.next.next;

            } else {
                curr = curr.next;
            }
            
        }
        return dummyHead.next;

    }
}