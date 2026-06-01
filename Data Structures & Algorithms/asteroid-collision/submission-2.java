class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int in : asteroids){
            while(!stack.isEmpty() && stack.peek()>0 && in<0){
                int diff = in + stack.peek();
                if(diff>0){
                    in = 0;
                }
                else if(diff<0){
                    stack.pop();
                }
                else{
                    in = 0;
                    stack.pop();
                }
            }
            if(in!=0){
                stack.push(in);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}