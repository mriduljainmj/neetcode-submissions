class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.merge(nums[i], 1, Integer::sum);
        }

        
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
       if(entry.getValue()>nums.length/2){
        return entry.getKey();
       }
    }

    return -1;

    }
}