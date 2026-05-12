class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int res = 0;
        map.put(0,1);
        for(int n : nums){
            sum = sum + n;
            int val = sum -k;
            if(map.containsKey(val)){
               res += map.get(val);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            

        }
        return res;
    }
}