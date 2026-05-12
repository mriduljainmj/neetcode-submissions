class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L=0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        for(int R=0;R<nums.length;R++){
            sum = sum + nums[R];
            while(sum>=target){
                length = Math.min(R - L + 1, length);
                sum  = sum - nums[L];
                L++;
            }
         
        }
           if (length ==  Integer.MAX_VALUE) {
            return 0;
            } 

    return length;
}
    
}