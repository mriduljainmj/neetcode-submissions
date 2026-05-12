class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ansSet = new HashSet<>();
        for(int num: nums){
            if(ansSet.contains(num)){
                return true;
            }
            ansSet.add(num);
        }
        return false;
    }
}