class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum =nums[0], minSum = nums[0], currMax = 0, currMin = 0, total=0;
        for(int n: nums){
            currMax = Math.max(currMax+n, n);
            currMin = Math.min(currMin+n, n);
            total = total+n;
            maxSum = Math.max(maxSum,currMax);
            minSum = Math.min(minSum, currMin);
        }
        return maxSum<0?  maxSum: Math.max(maxSum, total-minSum);
    }
}