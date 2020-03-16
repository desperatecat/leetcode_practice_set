//https://leetcode.com/problems/copy-list-with-random-pointer/submissions/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        List<List<Node>> l=new ArrayList<>();
        HashMap<Node,Integer> h=new HashMap<>();
        Node t=head;
        int count=0;
        while(t!=null){
            Node newNode=new Node(0,null,null);
            l.add(new ArrayList<>());
            l.get(count).add(newNode);
            l.get(count).add(t);
            h.put(t,count);
            count++;
            t=t.next;
        }
        for(int i=0;i<l.size();i++){
            Node NN = l.get(i).get(0);  //New Node
            Node ON = l.get(i).get(1);  //Original Node
            NN.val = ON.val;
            if(i+1<l.size()){
                NN.next=l.get(i+1).get(0);
            }
            else{
                NN.next=null;
            }
            if(ON.random==null){
                NN.random = null;
            }
            else{
                NN.random = l.get(h.get(ON.random)).get(0);
            } 
        }
        return l.get(0).get(0);
    }
}