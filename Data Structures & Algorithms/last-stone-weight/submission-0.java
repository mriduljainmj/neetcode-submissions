class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int stone : stones) {
            q.offer(-stone);
        }
        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            if (b > a) {
                   q.offer(a-b);
            }
         
        }

        q.offer(0);

        return Math.abs(q.peek());
    }
}
