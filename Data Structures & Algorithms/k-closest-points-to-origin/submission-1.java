class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q =new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] point : points){
            int distance = point[0]*point[0] + point[1]*point[1];
            q.offer(new int[]{distance, point[0],point[1]});
        }

        int[][] ans  = new int[k][2];
        
        for(int i =0;i<k;i++){
            int[] point = q.poll();
            ans[i] = new int[]{point[1], point[2]};
        }

        return ans;
        

    }
}
