/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/discuss/37461/Java-solution-with-O(1)-memory%2B-O(n)-time
class Solution {
    public Node connect(Node root) {
        Node level_start = root;
        while (level_start!=null){
            Node cur = level_start;
            while (cur != null) {
                if (cur.left != null) {
                    cur.left.next = cur.right;
                    if (cur.next != null) cur.right.next = cur.next.left; // we don't need to check for the right child
                }
                cur = cur.next;
            }
            level_start = level_start.left;
        }
        return root;
    }
}