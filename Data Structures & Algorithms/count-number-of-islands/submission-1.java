class Solution {
    public static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int island = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    bfs(r, c, grid);
                    island++;
                }
            }
        }

        return island;
    }

    public static void bfs(int r, int c, char[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.offer(new int[] {r, c});

        while (!q.isEmpty()) {
            int[] val = q.poll();
            int row = val[0],  col = val[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0], newCol = col + dir[1];
                if (newRow >= 0 && newCol >= 0 && newRow < grid.length &&
                 newCol < grid[0].length && grid[newRow][newCol]=='1'){
                    q.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                 }
            }
        }
    }
}
