class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxC = grid[0].length;
        int maxR = grid.length;
        int maxSize = 0;
        for(int r = 0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==1){
                    maxSize = Math.max(maxSize,dfs(grid,maxC,maxR,r,c));
                }
               
            }
        }
        return maxSize;

    }

    public int dfs(int[][] grid, int maxC, int maxR, int r, int c){
        if(r<0 || r>=maxR || c<0 || c>=maxC || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        
      
       
       return 1+ dfs(grid,maxC,maxR,r+1,c)+
       dfs(grid,maxC,maxR,r,c+1)+
       dfs(grid,maxC,maxR,r-1,c)+
       dfs(grid,maxC,maxR,r,c-1);
    }
}
