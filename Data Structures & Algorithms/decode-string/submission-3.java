class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                StringBuilder subStr = new StringBuilder();
                while(!(stack.peek().equals("["))){
                    subStr.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0,stack.pop());
                }
                int numVal = Integer.parseInt(num.toString());
                String repeatedStr = subStr.toString().repeat(numVal);
                stack.push(repeatedStr);
            }
            else{
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}