class Solution {
    public int removeDuplicates(int[] nums) {
        int l =1;
        int r = 1;
        int k =0;
        for(int i=1;i<nums.length;i++){
            if(nums[r]!=nums[r-1]){
                nums[l] = nums[r];
                l++;
                k++;
            }
            r++;
        }
        return k+1;
    }
}