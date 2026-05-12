class NumMatrix {
  public int[][] mat;
    public NumMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
         mat = new int[R][C];
        for(int i=0;i<R;i++){
            int res = 0;
            for(int j=0;j<C;j++){
                res = res + matrix[i][j];
                mat[i][j] = res;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for(int i =row1;i<=row2;i++){
            if(col1>0){
                ans  = ans + mat[i][col2] - mat[i][col1-1];
            }
            else{
                ans = ans + mat[i][col2];
            }
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */