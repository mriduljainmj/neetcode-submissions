class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0,0);
    }

    public static int dfs(int[] nums, int i, int total){
        if(i==nums.length){
            return total;
        }
        return dfs(nums, i+1, total) + dfs(nums, i+1, total^ nums[i]);
    }
}