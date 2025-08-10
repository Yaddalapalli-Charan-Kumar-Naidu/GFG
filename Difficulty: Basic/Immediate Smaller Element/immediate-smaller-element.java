// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here
        int i;
        for(i=0;i<arr.length-1;i++){
            if(arr[i+1]>=arr[i]){
                arr[i]=-1;
            }
            else{
                arr[i]=arr[i+1];
            }
        }
        arr[i]=-1;
    }
}