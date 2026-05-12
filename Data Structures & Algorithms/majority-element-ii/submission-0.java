class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int thres = (nums.length)/3;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> ite : map.entrySet()){
            if(ite.getValue()>thres){
                ans.add(ite.getKey());
            }   
        }

        return ans;

    }
}