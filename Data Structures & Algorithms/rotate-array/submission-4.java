class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k = k%nums.length;
        }
        int L = 0;
        int R = nums.length-1;
        reverse(nums,L,R);

        L = 0;
        R = k-1;
        reverse(nums,L,R);

        L = k;
        R = nums.length-1;
        reverse(nums,L,R);

    }

    public static void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }
}