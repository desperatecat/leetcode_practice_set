//https://github.com/grandyang/leetcode/issues/234

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;
       
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode last = slow.next, pre = head;

        while(last.next != null){
            ListNode temp = last.next;
            last.next = temp.next;
            temp.next = slow.next;
            slow.next = temp;
        }

        while(slow.next != null){
            slow = slow.next;
            if(pre.val != slow.val) return false;
            pre = pre.next;
        }
        return true;
        
    }
    
}