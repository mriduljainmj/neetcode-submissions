class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL  = matrix[0].length;

        int top = 0;
        int bottom  = ROW-1;

        while(top<=bottom){
            int rowToBeSelected = top + (bottom-top)/2;
            if(target > matrix[rowToBeSelected][COL-1]){
                top = rowToBeSelected+1;
            }
            else if(target < matrix[rowToBeSelected][0]){
                bottom  = rowToBeSelected-1;
            }
            else{
                break;
            }
        }

        if(!(top<=bottom)){
            return false;
        }

        int row = (top + bottom)/2;
        int  l =0;
        int  r = matrix[row].length;
        while(l<=r){
            int m = l + (r-l)/2;
            if(matrix[row][m] > target){
                r = m-1;
            }
            else if(matrix[row][m]< target){
                l = m+1;
            }
            else{
                return true;
            }
        }

        return false;

    }
}
