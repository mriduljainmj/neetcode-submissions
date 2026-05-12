class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int th = nums.length/3;
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()>th){
                ans.add(m.getKey());
            }
        }
        return ans;
    }
}