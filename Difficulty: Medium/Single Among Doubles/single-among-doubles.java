// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res^=arr[i];
        }
        return res;
    }
}