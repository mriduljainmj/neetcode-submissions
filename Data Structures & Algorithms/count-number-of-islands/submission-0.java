class Solution {
    public int numIslands(char[][] grid) {
        int maxR = grid.length;
        int maxC = grid[0].length;
        int count = 0;
        for(int i=0;i<maxR;i++){
            for(int j=0; j<maxC;j++){
                if (grid[i][j] == '1') {
                    dfs(grid, maxR, maxC, count, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int maxR,int maxC,int count, int sr, int sc ){
        if(sr<0 || sr>=maxR || sc<0 || sc >= maxC || grid[sr][sc] == '0'){
            return;
        }
         grid[sr][sc] = '0';
        dfs(grid, maxR, maxC, count, sr+1, sc);
        dfs(grid, maxR, maxC, count, sr, sc+1);
        dfs(grid, maxR, maxC, count, sr-1, sc);
        dfs(grid, maxR, maxC, count, sr, sc-1);

    }
}
