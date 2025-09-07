class Solution {
    int missingNum(int arr[]) {
        // code here
        int maxNum=arr[0];
        long total=arr[0];
        for(int i=1;i<arr.length;i++){
            total+=arr[i];
            maxNum=Math.max(maxNum,arr[i]);
        }
long sum = ((long) maxNum * (maxNum + 1)) / 2;
        if(sum==total){
            return maxNum+1;
        }
        return (int)(sum-total);
    }
}