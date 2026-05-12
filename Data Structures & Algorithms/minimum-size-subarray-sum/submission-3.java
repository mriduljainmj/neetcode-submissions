class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int sum = 0;
        int output = 1000000;
        for(int R=0;R<nums.length;R++){
            sum = sum + nums[R];
            while(sum>=target){
                int length = R-L+1;
                output = Math.min(output,length);
                sum = sum - nums[L];
                L++;
            }
        }
        if(output==1000000){
            return 0;
        }
        return output;
    }
}