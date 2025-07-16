/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        // int zero=0;
        // int one=0;
        // int two=0;
        // Node temp=head;
        // while(temp!=null){
        //     if(temp.data==0){
        //         zero++;
        //     }
        //     else if(temp.data==1){
        //         one++;
                
        //     }
        //     else{
        //         two++;
        //     }
        //     temp=temp.next;
        // }
        // int i=0;
        // temp=head;
        // while(temp!=null && zero>0){
        //     temp.data=0;
        //     zero--;
        //     temp=temp.next;
        // }
     
        // while(temp!=null && one>0){
        //     temp.data=1;
        //     one--;
        //     temp=temp.next;
        // }

        // while(temp!=null && two>0){
        //     temp.data=2;
        //     two--;
        //     temp=temp.next;
        // }
        // return head;
        Node ones=new Node(0);
        Node headOnes=ones;
        Node zeros=new Node(0);
        Node headZeros=zeros;
        Node twos=new Node(0);
                Node headTwos=twos;

        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zeros.next=temp;
                zeros=zeros.next;
            }
            else if(temp.data==1){
                ones.next=temp;
                ones=ones.next;
                
            }
            else{
                twos.next=temp;
                twos=twos.next;
            }
            temp=temp.next;
        }
        zeros.next=headOnes.next!=null?headOnes.next:headTwos.next;
        ones.next=headTwos.next;
        twos.next=null;
        head=headZeros.next;
        return head;
        
    }
}