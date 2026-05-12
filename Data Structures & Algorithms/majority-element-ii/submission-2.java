class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.size()<=2){
                continue;
            }

            HashMap<Integer, Integer> tempMap = new HashMap<>();
            for(Map.Entry<Integer, Integer> m : map.entrySet()){
                if(m.getValue()>1){
                    tempMap.put(m.getKey(), m.getValue()-1);
                }
            }
            map = tempMap;

            
        }

        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {
            int frequency = 0;
            for (int num : nums) {
                if (num == key) frequency++;
            }
            if (frequency > nums.length / 3) {
                res.add(key);
            }
        }

        return res;


    }
}