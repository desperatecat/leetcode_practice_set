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

// Time: O(n)
// Space: O(1)
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/discuss/616973/Java-or-Constant-Space-or-Time-O(N)-or-Easy-to-understand
class Solution {
    public Node connect(Node root) {        
        if(root == null) return root;
        
        // Connect curr node children if they exist
        if(root.left != null) root.left.next = root.right;
        
        // Find right most child of curr node
        Node rightMost = root.right != null ? root.right : root.left;

        // If curr node contains atleast one child
        if(rightMost != null) {
            Node next = root.next;
            // While the curr node has next pointer, keep connecting their children
            while(next != null) {
                if(next.left != null) {
                    rightMost.next = next.left;
                    rightMost = rightMost.next;
                }
                if(next.right != null) {
                    rightMost.next = next.right;
                    rightMost = rightMost.next;
                }
                next = next.next;
            }
        }
        
        // Recurse through left & right children
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}
