class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowFind = 0;
        for(int i=0;i<matrix.length;i++){
            if(target>matrix[i][matrix[0].length-1]){
                rowFind++;
            }
            else{
                break;
            }
        }
        if(rowFind == matrix.length){
            return false;
        }
        int l = 0 ;
        int r = matrix[rowFind].length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(matrix[rowFind][mid] > target){
                r = mid-1;
            }
            else if(matrix[rowFind][mid] < target){
                l = mid+1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
