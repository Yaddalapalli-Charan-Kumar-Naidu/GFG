// User function Template for Java

class Solution {
    static String reverse(String pre_exp){
        StringBuilder str=new StringBuilder();
        for(int i=pre_exp.length()-1;i>=0;i--){
            str.append(pre_exp.charAt(i));
        }
        return str.toString();
    }
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        pre_exp=reverse(pre_exp);
        int i=0;
        while(i<pre_exp.length()){
            char c=pre_exp.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                stack.push(Character.toString(c));
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push(op1+op2+c);
            }
            i++;
        }
        // if(stack.isEmtpy()){
        //     return null;
        // }
        return stack.pop();
    }
}
