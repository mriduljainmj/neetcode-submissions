class Solution {
    public int removeElement(int[] nums, int val) {
        int L=0,k=0;
        
        while(L<nums.length){
          if(nums[L] != val){
            nums[k] = nums[L];
            k++;
          }
          L++;
        }
        return k;
    }
}