class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currSum = new ArrayList<>();
        combinations(1,res, currSum, n, k);
        return res;
    }

    public static void combinations(
        int i, List<List<Integer>> res, List<Integer> currSum, int n, int k) {
            if(currSum.size()==k){
                res.add(new ArrayList<>(currSum));
                return;
            }

            if(i>n){
                return;
            }

            for(int j = i; j<=n;j++){
                currSum.add(j);
                combinations(j+1,res,currSum, n , k);
                currSum.remove(currSum.size()-1);
            }
        }
}