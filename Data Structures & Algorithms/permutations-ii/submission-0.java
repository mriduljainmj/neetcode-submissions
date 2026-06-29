class Solution {
    private Map<Integer, Integer> count;
    private List<List<Integer>> res;

    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        count = new HashMap<>();    
        List<Integer> prem = new ArrayList<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        dfs(nums, prem);
        return res;

    }

    private void dfs(int[] nums, List<Integer> prem){
        if(prem.size()==nums.length){
            res.add(new ArrayList<>(prem));
            return;
        }

        for(int num: count.keySet()){
            if(count.get(num)>0){
                prem.add(num);
                count.put(num, count.get(num)-1);
                dfs(nums, prem);
                count.put(num, count.get(num)+1);
                prem.remove(prem.size()-1);
            }
        }
    }
}
