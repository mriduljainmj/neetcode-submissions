class Solution {
    private int[][] grid;
    private boolean[][] visited;
    private int rows,cols;
    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        visited = new boolean[rows][cols];

        for(int i = 0;i< rows; i++){
            for(int j = 0; j < cols;j++){
                if(grid[i][j]==1){
                    return dfs(i, j, 0);
                }
            }
        }
        return 0;

    }


    public int dfs(int i, int j, int perimeter){
        if(i<0 || j<0  || i>=rows || j>= cols || grid[i][j]==0){
            return 1;
        }

        if(visited[i][j]){
            return 0;
        }

        visited[i][j] = true;

        int total = dfs(i,j+1, 0);
        total += dfs(i+1,j, 0);
        total += dfs(i,j-1, 0);
        total += dfs(i-1,j, 0);

        return total;
    }


}