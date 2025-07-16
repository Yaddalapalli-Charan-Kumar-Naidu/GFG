// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==x){
                if(temp.prev==null){
                    head=head.next;
                }
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }
                if(temp.prev!=null){
                    temp.prev.next=temp.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}