class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int L = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int R=0;R<nums.length;R++){
            if(R-L>k){
                set.remove(nums[L]);
                L++;
            }
            if(set.contains(nums[R])){
                return true;
            }
            else{
                set.add(nums[R]);
            }
        }
        return false;
    }
}