class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxF=-1;
        int maxS=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxF){
                maxS=maxF;
                maxF=arr[i];
            }
            else if(arr[i]<maxF && arr[i]>maxS){
                maxS=arr[i];
            }
        }
        return maxS;
    }
}