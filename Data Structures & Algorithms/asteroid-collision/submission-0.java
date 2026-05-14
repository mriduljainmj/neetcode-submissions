class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        for(int as : asteroids){
            while(!st.isEmpty() && st.peek() > 0 && as <0){
                int diff = as + st.peek();
                if(diff<0){
                    st.pop();
                }
                else if(diff>0){
                    as = 0;
                }
                else{
                    as = 0;
                    st.pop();
                }
            }
            if(as!=0){
                st.add(as);
            }
        }
   return st.stream().mapToInt(i -> i).toArray();
    }
}