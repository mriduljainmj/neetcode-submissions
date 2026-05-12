class Solution {
    public int[] sortArray(int[] nums) {
       return  mergeSort(nums, 0, nums.length-1);
    }

    public static int[] mergeSort(int[] arr, int left, int right){
        if(right>left){
            int m = (left+right)/2;
            mergeSort(arr,left,m);
            mergeSort(arr, m+1,right);
            merger(arr, left, m, right);
        }
        return arr;
    }

    public static void merger(int[] arr, int l, int m, int r){
        int lengthL = m-l+1;
        int lengthR = r-m;

        int[] L = new int[lengthL];
        int[] R = new int[lengthR];

        for(int i=0;i<lengthL;i++){
            L[i] = arr[l+i];
        }

        for(int j =0; j<lengthR;j++){
            R[j] = arr[m+1+j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<lengthL && j<lengthR){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
               else{
                 arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<lengthL){
                arr[k] = L[i];
                i++;
                k++;
        }

        while(j<lengthR){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

}