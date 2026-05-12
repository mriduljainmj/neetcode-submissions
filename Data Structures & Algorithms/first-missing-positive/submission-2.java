class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            set.add(n);
        }


        for(int i=1;i<=nums.length+1;i++){
            if(set.contains(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return 1;
    }
}