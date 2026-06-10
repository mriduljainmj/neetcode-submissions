class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return true;
            }

            if (nums[m] > nums[l]) {
                if (nums[l] <= target && nums[m] > target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            else if (nums[m] < nums[l]) {
                if (nums[r] >= target && nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                l++;
            }
        }

        return false;
    }
}