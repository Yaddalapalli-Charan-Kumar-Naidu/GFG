class Solution {
    public int findMin(int n) {
        // code here
        int[] arr=new int[]{1,2,5,10};
        
        int num=n;
        int count=0;
        while(num>0){
            int right=4-1;
            while(num<arr[right]){
                right--;
            }
            num-=arr[right];
            count++;
        }
        return count;
    }
}
