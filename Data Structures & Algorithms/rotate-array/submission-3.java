class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int l = 0;
        int r = nums.length-1;
        swap(nums, l,r);

        int L = 0;
        int R = k-1;
       swap(nums, L, R);

        int left= k;
        int right = nums.length-1;
        swap(nums, left, right);

    }
    public static void swap(int[] nums, int left, int right){
        while(right>left){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
        }
    }
}