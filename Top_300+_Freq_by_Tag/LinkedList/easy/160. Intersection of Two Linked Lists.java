//https://github.com/grandyang/leetcode/issues/160


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


 //solution 1 (normal)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        int lenA = getLength(headA), lenB = getLength(headB);
        if(lenA > lenB){
            for (int i=0; i< lenA - lenB; i++){
                headA = headA.next;
            }
        } else {
            for (int i=0; i< lenB - lenA; i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return (headA != null && headB != null) ? headA : null;
    } 

    public int getLength(ListNode head){
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        } 
        return cnt;
    }
}


//solution 2 (ignore length)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return a;
    }
}