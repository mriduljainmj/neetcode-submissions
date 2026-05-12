class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zeroCount = 0;
        int totalMultiply = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                totalMultiply = totalMultiply* nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(zeroCount==0){
                ans[i] = totalMultiply/nums[i];
            }
            else if(zeroCount==1){
                if(nums[i] == 0){
                    ans[i] = totalMultiply;
                }
                else{
                    ans[i] = 0;
                }
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;

    }
}  
