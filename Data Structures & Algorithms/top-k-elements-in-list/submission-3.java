class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<int[]> arrList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
            arrList.add(new int[]{entrySet.getValue(),entrySet.getKey()});
        }

        arrList.sort((a,b)-> b[0]-a[0]);

        for(int i=0;i<k;i++){
            ans[i] = arrList.get(i)[1];
        }

        return ans;

    }
}
