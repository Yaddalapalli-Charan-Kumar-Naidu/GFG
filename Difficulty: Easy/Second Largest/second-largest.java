class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstMax=arr[0];
        int secondMax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=firstMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}