class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int res = 0;
        for(int i =0;i<nums.length;i++){
            if(!(set.contains(nums[i]-1))){
                int length =1;
                while(set.contains(nums[i]+length)){
                    length++;
                }
                res = Math.max(res, length);
            }
        }

        return res;

    }
}
 