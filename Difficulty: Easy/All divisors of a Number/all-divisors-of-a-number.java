class Solution {
    public static void print_divisors(int n) {
        // code here
        // if(n!=1){
        //     System.out.print(1+" ");
        // }
        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        // System.out.print(n);
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        for(int num:set){
            System.out.print(num+" ");
        }
        
    }
}
