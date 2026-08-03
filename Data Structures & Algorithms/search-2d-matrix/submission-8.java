class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        int top = 0;
        int bottom = ROW-1;

        while(bottom>=top){
            int rowTobeSelected = top + (bottom-top)/2;
            if(target> matrix[rowTobeSelected][COL-1]){
                top = rowTobeSelected+1;
            }
            else if(target< matrix[rowTobeSelected][0]){
                bottom = rowTobeSelected -1;
            }
            else{
                break;
            }
        }

        if(!(top<=bottom)){
            return false;
        }

        int row = (top + bottom)/2;
        int l =0;
        int r = matrix[row].length;

        while(r>=l){
            int m = (l +r)/2;
            if(target>matrix[row][m]){
                l = m+1;
            }
            else if(target< matrix[row][m]){
                r = m-1;
            }
            else{
                return true;
            }
        }

        return false;
        

    }
}
