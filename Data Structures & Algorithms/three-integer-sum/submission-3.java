class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int L = i+1;
            int R = nums.length-1;
            while(R>L){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum>0){
                    R--;
                }
                else if(sum<0){
                    L++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    L++;
                    while(L<R && nums[L] == nums[L-1]){
                        L++;
                    }
                }
            }
        }
        return res;
    }
}
