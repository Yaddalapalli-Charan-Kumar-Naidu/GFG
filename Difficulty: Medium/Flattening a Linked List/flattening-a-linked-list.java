class Solution {
    // Function to flatten a linked list
    Node merge2List(Node list1,Node list2){
        Node temp1=list1;
        Node temp2=list2;
        Node newList=new Node(-1);
        Node temp=newList;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.bottom=temp1;
                temp1=temp1.bottom;
            }
            else{
                temp.bottom=temp2;
                temp2=temp2.bottom;
            }
            temp=temp.bottom;
        }
        if(temp1!=null){
            temp.bottom=temp1;
        }
        else{
            temp.bottom=temp2;
        }
        
        return newList.bottom;
    }
    Node flatten(Node root) {
        // code here
        if(root==null || root.next==null){
            return root;
        }
        Node list=flatten(root.next);
        root=merge2List(root,list);
        
        return root;
    }
}