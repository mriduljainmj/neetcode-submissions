class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m]>target){
                r--;
            }
            else if(nums[m]<target){
                l++;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
