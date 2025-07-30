// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        int i=0;
        while(i<post_exp.length()){
            char c=post_exp.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                stack.push(Character.toString(c));
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push(c+op2+op1);
            }
            i++;
        }
        return stack.pop();
    }
}
