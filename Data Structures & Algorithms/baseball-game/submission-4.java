class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack  = new Stack<>();
        int sum = 0;
        for(String s : operations){
            if(s.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int val = stack.peek();
                int newVal = val * 2;
                stack.push(newVal);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        for(int val : stack){
            sum = sum + val;
        }

        return sum;
    }
}