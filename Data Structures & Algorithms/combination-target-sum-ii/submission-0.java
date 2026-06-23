class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();
        int total = 0;
        dfs(0, candidates, target, total, curr, res);
        return res;
    }

    public static void dfs(int i, int[] candidates, int target, int total, List<Integer> curr,
        List<List<Integer>> res) {
            if(total == target){
                res.add(new ArrayList<>(curr));
                return;
            }
            if(i>=candidates.length || total > target){
                return;
            }
            curr.add(candidates[i]);
            dfs(i+1, candidates, target, total+ candidates[i], curr, res);
            curr.remove(curr.size()-1);

            while(i+1< candidates.length && candidates[i] == candidates[i+1]){
                i++;
            }
            
            dfs(i+1, candidates, target, total, curr, res);

        }
}
