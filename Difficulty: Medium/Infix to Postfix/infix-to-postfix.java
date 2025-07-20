class Solution {
    public static int priority(Character c){
        if(c=='^'){
            return 3;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        int i=0;
        StringBuilder res=new StringBuilder();
        while(i<s.length()){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res.append(c);
            }
            else{
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    if(priority(c)==0){
                        if(c=='('){
                            stack.push(c);
                        }
                        else if(c==')'){
                            while(!stack.isEmpty() && stack.peek()!='('){
                                res.append(stack.pop());
                            }
                            if(!stack.isEmpty() && stack.peek()=='(')
                            stack.pop();
                        }
                    }
                    else{
                        while(!stack.isEmpty() && priority(c)<=priority(stack.peek())){
                            res.append(stack.pop());
                        }
                        stack.push(c);
                    }
                }
                
            }
            i++;
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
}