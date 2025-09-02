class Solution {
    public int findMin(int n) {
        // code here
        int[] currency={1,2,5,10};
        int right=3;
        int res=0;
        while(n>0 && right>=0){
            if(currency[right]>n){
                right--;
            }
            else{
                n-=currency[right];
                res++;
            }
        }
        return res;
    }
}
