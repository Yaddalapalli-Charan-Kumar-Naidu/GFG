// User function Template for Java

class Solution {
    static String reverse(String pre_exp){
        StringBuilder str=new StringBuilder();
        int i=pre_exp.length()-1;
        while(i>=0){
            str.append(pre_exp.charAt(i));
            i--;
        }
        return str.toString();
    }
    static String preToInfix(String pre_exp) {
        // code here
        pre_exp=reverse(pre_exp);
        Stack<String> stack=new Stack<>();
        int i=0;
        while(i<pre_exp.length()){
            char c=pre_exp.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                stack.push(Character.toString(c));
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push('('+op1+c+op2+')');
            }
            // System.out.println("TOP:"+stack.peek());
            i++;
        }
        if(stack.isEmpty()){
            return null;
        }
        return stack.pop();
    }
}
