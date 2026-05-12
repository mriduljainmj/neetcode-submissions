class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int L=0;
        int length = Integer.MAX_VALUE;
        for(int R=0;R<nums.length;R++){
            total = total + nums[R];
            while(total>=target){
                length = Math.min(R-L+1, length);
                total = total - nums[L];
                L++;
            }
        }
        if (length ==  Integer.MAX_VALUE) {
        return 0;
    } 
        return length;
    }
}