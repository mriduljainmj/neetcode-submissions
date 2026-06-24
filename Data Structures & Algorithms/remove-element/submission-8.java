class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0;
        while(n>i){
            if(nums[i]==val){
                n = n-1;
                nums[i] = nums[n];
            }
            else{
                i++;
            }
        }
        return i;        
    }
}