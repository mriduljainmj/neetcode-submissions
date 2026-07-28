class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L=0;
        int output = Integer.MAX_VALUE;
        int sum = 0;
        for(int R =0;R<nums.length;R++){
            sum = sum + nums[R];
            while(sum>=target){
                output = Math.min(output,R-L+1);
                sum = sum - nums[L];
                L++;
            }
        }

        if(output==Integer.MAX_VALUE){
            return 0;
        }
        return output;
    }
}