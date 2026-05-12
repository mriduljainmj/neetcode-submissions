class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                if (nums[i] + nums[L] + nums[R] > 0) {
                    R--;
                } else if (nums[i] + nums[L] + nums[R] < 0) {
                    L++;
                } else {
                    ansList.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    L++;
                    R--;
                    while (L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }
                }
            }
        }
        return ansList;
    }
}
