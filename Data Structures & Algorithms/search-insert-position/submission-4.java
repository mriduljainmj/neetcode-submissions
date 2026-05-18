class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int l = 0;
        int r  = nums.length-1;
      while (l <= r) {
            int m = (l+r)/2;
            if(nums[m]>target){
                ans = m;
                r = m-1;
            }
            else if(nums[m]<target){
                l = m+1;
            }
            else{
               ans = m;
               break;
            }
        }
        

        return ans;
    }
}