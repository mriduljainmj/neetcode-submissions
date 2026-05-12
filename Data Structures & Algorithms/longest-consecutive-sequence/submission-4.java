class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            set.add(n);
        }
        int longest = 0;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int length = 0;
                while(set.contains(nums[i]+length)){
                    length = length+1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
