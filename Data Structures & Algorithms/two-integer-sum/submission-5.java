class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int valueToFind = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(valueToFind==nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
