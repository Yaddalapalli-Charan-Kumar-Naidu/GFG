/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            if(set.contains(target-temp.data)){
                ArrayList<Integer> subList = new ArrayList<>();
                subList.add(temp.data);
                subList.add(target - temp.data);
                Collections.sort(subList);
                list.add(subList);
            }
            set.add(temp.data);
            temp=temp.next;
        }
         list.sort((a, b) -> {
        if (!a.get(0).equals(b.get(0))) {
            return a.get(0) - b.get(0);
        } else {
            return a.get(1) - b.get(1);
        }
    });
        return list;
    }
}
