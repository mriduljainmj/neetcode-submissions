class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int[] mergeSort(int[] arr, int l, int r){
        if(r>l){
            int m = l + (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merger(arr,l,m,r);
        }
        return arr;
    }

    public static void merger(int[] arr, int l, int m, int r){
        int lengthL= m-l+1;
        int lengthR = r -m;

        int[] Larr = new int[lengthL];
        int[] Rarr = new int[lengthR];

        for(int i=0;i<lengthL;i++){
            Larr[i] = arr[l+i];
        }

        for(int j=0;j<lengthR;j++){
            Rarr[j] = arr[m+j+1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<lengthL && j<lengthR){
            if(Larr[i]<=Rarr[j]){
                arr[k] = Larr[i];
                i++;
            }
            else{
                arr[k] = Rarr[j];
                j++;
            }
            k++;
        }

        while(i<lengthL){
            arr[k] = Larr[i];
            i++;
            k++;
        }   

        while(j<lengthR){
            arr[k] = Rarr[j];
            j++;
            k++;
        }
        
    }
}