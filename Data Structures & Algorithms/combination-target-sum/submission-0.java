class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int total = 0;
        dfs(0,nums, target, 0, curr, res);
        return res;
    }

    public static void dfs(int i,
        int[] nums, int target, int total, List<Integer> curr, List<List<Integer>> res) {
            if(total==target){
                res.add(new ArrayList<>(curr));
                return;
            }
            if(i>=nums.length ||  total>target){
                return;
            }

            curr.add(nums[i]);
            dfs(i, nums, target, total+ nums[i], curr, res);
            curr.remove(curr.size()-1);
            dfs(i+1, nums, target, total, curr, res);
        }
}
