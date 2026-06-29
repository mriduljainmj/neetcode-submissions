class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return helper(0, nums);
    }

    public static List<List<Integer>> helper(int i, int[] nums){
        if(i==nums.length){
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }
         List<List<Integer>> ans = new ArrayList<>();
         List<List<Integer>> prem = helper(i+1, nums);
         for(List<Integer> p : prem){
            for(int j=0;j<p.size()+1;j++){
                List<Integer> pCopy = new ArrayList<>();
                pCopy.addAll(p);
                pCopy.add(j, nums[i]);
                ans.add(pCopy);
            }
         }
        return ans;
    }
}
