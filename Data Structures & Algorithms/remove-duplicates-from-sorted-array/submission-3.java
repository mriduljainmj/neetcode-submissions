class Solution {
    public int removeDuplicates(int[] nums) {
        int L=1;
        int R =1;
        for(int i=1;i<nums.length;i++){
            if(nums[R]!=nums[R-1]){
                nums[L] = nums[R];
                L++;
            }
            R++;
        }

        return L;
    }
}