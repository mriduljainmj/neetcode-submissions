class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                int diff = asteroids[i] + stack.peek();
                if(diff>0){
                    asteroids[i] = 0;
                }
                else if(diff<0){
                    stack.pop();
                }
                else{
                    stack.pop();
                    asteroids[i] = 0;
                }
            }
            if(asteroids[i]!=0){
                stack.push(asteroids[i]);
            }
        }

        int[] ans = new int[stack.size()];
        int i =0;
        for(int n: stack){
            ans[i] = n;
            i++;
        }

        return ans;
    }
}