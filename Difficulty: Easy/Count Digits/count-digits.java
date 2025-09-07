// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int temp=n;
        int count=0;
        while(temp>0){
            if(temp%10!=0 && n%((int)temp%10)==0){
                count++;
            }
            temp=(int)temp/10;
        }
        return count;
        
    }
}