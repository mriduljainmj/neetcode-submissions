class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
         map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];

            int temp = sum -k;
            if(map.containsKey(temp)){
                res = res + map.get(temp);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}