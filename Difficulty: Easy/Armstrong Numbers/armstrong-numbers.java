// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int len=(int)Math.floor(Math.log10(n))+1;
        int res=0;
        int temp=n;
        while(temp!=0){
            int d=temp%10;
            res+=(int)Math.pow(d,len);
            temp=(int)temp/10;
        }
        return res==n;
    }
}