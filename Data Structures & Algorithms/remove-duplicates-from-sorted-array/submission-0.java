class Solution {
    public int removeDuplicates(int[] nums) {
        int L = 1;
        for(int R=1;R<nums.length;R++){
            if(nums[R] != nums[R-1]){
                nums[L] = nums[R];
                L++;
            }
        }
        return L;
    }
}