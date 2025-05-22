// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        // int maxLen=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     int j;
        //     for(j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //         maxLen=Math.max(maxLen,j-i+1);
        //     }
        //     }
            
        // }
        // return maxLen;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    
}
